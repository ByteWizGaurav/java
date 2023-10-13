import java.awt.event.MouseAdapter;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;

class Souravpagal extends Frame {
    Souravpagal() {
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter()

        {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        java.awt.Button b1 = new java.awt.Button("click");
        java.awt.Button b2 = new java.awt.Button("cancel");
        setLayout(null);
        b1.setBounds(20, 100, 100, 100);
        b2.setBounds(140, 100, 100, 100);
        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setBackground(java.awt.Color.magenta);
                setForeground(java.awt.Color.white);
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setBackground(java.awt.Color.white);
                setForeground(java.awt.Color.magenta);
            }
        });
    }

    public static void main(String arr[]) {
        new Souravpagal();
    }
}