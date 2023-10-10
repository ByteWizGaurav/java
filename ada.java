import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Antshant extends Frame implements ActionListener, KeyListener {
	Label l = new Label("0");
	TextField t = new TextField(10);
	Button b = new Button("mujhe chhuo");
	FlowLayout f = new FlowLayout();
	
	Antshant(){
		add(l);
		add(b);
		add(t);
		setLayout(f);
		b.addActionListener(this);
		b.setForeground(Color.blue);
		t.addKeyListener(this);
		requestFocus();
	}

	public void actionPerformed(ActionEvent something){
		System.out.println("Text -> " + t.getText().toLowerCase());
	}

	public void keyReleased(KeyEvent e){
		TextField text = (TextField) e.getSource();
		String baate = text.getText();
		int size = baate.length();
		char ch = baate.charAt(size-1);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
			System.out.println("chal rha hai");
		} else {
			String newSt = baate.substring(0, size-1);
			System.out.println("tez mat bn bete number hta rha hu");
			text.setText(newSt);
		}
	}
	public void keyPressed(KeyEvent e){
		System.out.println("dabaa diya");
	}
	public void keyTyped(KeyEvent e){
		System.out.println("choot gya");
	}
}

class keys extends WindowAdapter{
	public static void main(String[] args){
		Antshant obj = new Antshant();
		obj.setVisible(true);
		obj.setSize(400, 400);
	}
	public static void windowclosing(WindowEvent e){
		System.exit(0);
	}
}
