class A{
    public static void main(String[] args) throws java.io.IOException {
        java.io.Reader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);

        System.out.print("Enter your text :- ");
        String str = br.readLine();

        System.out.println("Your text is :- ");
        System.out.println(str);
    }
}