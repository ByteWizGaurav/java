import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModernCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JPanel buttonPanel;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton equalsButton, clearButton;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public ModernCalculator() {
        setTitle("Modern Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 550);
        setLocationRelativeTo(null);
        setResizable(false);

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 36));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = createButton(String.valueOf(i), Color.WHITE);
        }

        operationButtons = new JButton[4];
        operationButtons[0] = createButton("+", Color.ORANGE);
        operationButtons[1] = createButton("-", Color.ORANGE);
        operationButtons[2] = createButton("*", Color.ORANGE);
        operationButtons[3] = createButton("/", Color.ORANGE);

        equalsButton = createButton("=", Color.GREEN);
        clearButton = createButton("C", Color.RED);

        addComponentsToPanel();

        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 24));
        button.setBackground(color);
        button.addActionListener(this);
        return button;
    }

    private void addComponentsToPanel() {
        buttonPanel.add(clearButton);
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(numberButtons[i]);
        }
        buttonPanel.add(operationButtons[0]);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(operationButtons[1]);
        buttonPanel.add(operationButtons[2]);
        buttonPanel.add(operationButtons[3]);
        buttonPanel.add(equalsButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            textField.setText(textField.getText() + command);
        } else if (command.equals(".")) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
            operator = '\0';
        } else {
            if (operator != '\0') {
                actionPerformed(new ActionEvent(e.getSource(), ActionEvent.ACTION_PERFORMED, "="));
                num1 = result;
            }
            operator = command.charAt(0);
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ModernCalculator());
    }
}