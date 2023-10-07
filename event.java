import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener{
    Button b = new Button();
    private int x = 0;
    MyFrame(){
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent something){
        System.out.println("Ye chal rha h " + (++x) + " baar");
    }
}

class check{
    public static void main(String[] args) {
        MyFrame obj = new MyFrame();
        obj.setVisible(true);
    }
}