import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Sourav extends java.awt.Frame implements java.awt.event.ActionListener
{
	java.awt.Button b1=new java.awt.Button("+");
	java.awt.Button b2=new java.awt.Button("-");
	java.awt.TextField t1=new java.awt.TextField("0");
	Sourav()
	{
		setSize(800,800);
		setVisible(true);
		setLayout(null);
		b1.setBackground(java.awt.Color.black);
		b1.setForeground(java.awt.Color.white);
		b2.setBackground(java.awt.Color.black);
		b2.setForeground(java.awt.Color.white);
		b1.setBounds(40,300,100,70);
		b2.setBounds(240,300,100,70);
		t1.setBounds(200,100,100,80);
		t1.setEditable(false);
		t1.setForeground(java.awt.Color.white);
		t1.setBackground(java.awt.Color.black);
		setBackground(java.awt.Color.magenta);
		add(t1);
		add(b1);
		add(b2);
		setFont(new java.awt.Font(java.awt.Font.SERIF,3,20));
		b1.addActionListener(this);
		b2.addActionListener(this);
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }});
	}
	public void actionPerformed(java.awt.event.ActionEvent e)
    {
        java.awt.Button b = (java.awt.Button)e.getSource();
        int x = java.lang.Integer.parseInt(t1.getText());
        System.out.print("\nthe value of x will be :- " + x);
        if (b == b1)
        {
            x++;
        }
        else
        {
            x--;
        }
        t1.setText(x + "");
    }

	public static void main(String arr[])
	{
		new Sourav();
	}

}