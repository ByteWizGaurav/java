import java.awt.Frame;
import java.awt.Button;
// import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class calculator implements ActionListener {

	public void actionPerformed(ActionEvent something) {
		System.out.println("chal rha hai");
		Button bt = (Button) something.getSource();
		String text = bt.getLabel();
		char operator = '\0';
		int first = -1;
		int second = -1;
	
		if (text.matches("\\d")) {
			if (first == -1) {
				first = Integer.parseInt(text);
			} else {
				if (second == -1) {
					second = Integer.parseInt(text);
				}
			}
		} else if (text.matches("[+\\-*/]")) {
			operator = text.charAt(0);
		} else if (text.equals("=")) {
			if (first == -1 || second == -1 || operator == '\0') {
				System.out.println("Enter complete statement");
			} else {
				int result = performOperation(first, second, operator);
				System.out.println(result);
				first = result;
				second = -1;
				operator = '\0';
			}
		}
	}
	
	private int performOperation(int first, int second, char operator) {
		switch (operator) {
			case '+':
				return first + second;
			case '-':
				return first - second;
			case '*':
				return first * second;
			case '/':
				if (second != 0) {
					return first / second;
				} else {
					System.out.println("Division by zero!");
					return 0;
				}
			default:
				return 0;
		}
	}	

	public static void main(String[] args) {
		Frame f = new Frame("Calculator");
		Label t = new Label("0");
		BorderLayout borderLayout = new BorderLayout();
		Panel panel = new Panel();
		GridLayout gridLayout = new GridLayout(4, 4);
		Button[][] buttons = new Button[4][4];
		String[][] buttonNames = { { "7", "8", "9", "/" }, { "4", "5", "6", "*" }, { "1", "2", "3", "-" },
				{ "0", ".", "=", "+" } };
		Font largerFont = new Font("SansSerif", Font.BOLD, 16);

		f.setVisible(true);
		f.setSize(400, 400);
		f.setLayout(borderLayout);
		f.add(t, BorderLayout.NORTH);
		t.setPreferredSize(new Dimension(f.getWidth(), 60));

		gridLayout.setHgap(10);
		gridLayout.setVgap(10);
		panel.setLayout(gridLayout);

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				buttons[i][j] = new Button(buttonNames[i][j]);
				buttons[i][j].setFont(largerFont);
				panel.add(buttons[i][j]);
			}

		f.add(panel, BorderLayout.CENTER);

		for (Button[] buttonArray : buttons) {
			for (Button button : buttonArray) {
				button.addActionListener(new calculator());
			}
		}
	}
}
