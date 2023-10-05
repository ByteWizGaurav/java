import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.BorderLayout;

class calculator{
	public static void main(String[] args){
		Frame f = new Frame();
		f.setVisible(true);
		Button b = new Button("Mujhe chhuo");
		BorderLayout bl = new BorderLayout();
		TextField t = new TextField();
		f.setLayout(bl);
		f.add(t, BorderLayout.NORTH);
		t.setBounds(40,40,180,500);
	}
}
