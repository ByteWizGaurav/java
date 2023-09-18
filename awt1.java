class awt{
	public static void main(String[] s){
		java.awt.Button b = new java.awt.Button("Mujhe dabaao");
		java.awt.Frame f = new java.awt.Frame("First software");
		java.awt.FlowLayout fl = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
		f.setLayout(fl);
		f.setSize(100,200);
		f.setVisible(true);
		f.add(b);
	}
}
