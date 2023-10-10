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

class Antshant extends Frame implements ActionListener, KeyListener {
	Label l = new Label("0");
	TextField t = new TextField(10);
	Button b = new Button("mujhe chhuo");
	FlowLayout f = new FlowLayout();
	
	Antshant(){
		add(l);
		add(t);
		setLayout(f);
		b.addActionListener(this);
		b.setForeground(Color.blue);
		add(b);
		t.addKeyListener(this);
		requestFocus();
	}

	public void actionPerformed(ActionEvent something){
		System.out.println("Text -> " + t.getText().toLowerCase());
	}

	public void keyTyped(KeyEvent e){
		char ch = e.getKeyChar();
		if(!Character.isLetter(ch)){
			e.consume();
		}

	}
	public void keyPressed(KeyEvent e){
		System.out.println("dabaa diya");
	}
	public void keyReleased(KeyEvent e){
		System.out.println("choot gya");
	}
}

class key{
	public static void main(String[] args){
		Antshant obj = new Antshant();
		obj.setVisible(true);
		obj.setSize(400, 400);
	}
}
