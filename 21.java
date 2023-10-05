class twentyOne{
	static void display(java.util.ArrayList<Integer> arr){
		for(int i: arr) System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) throws java.io.IOException {
		java.io.BufferReader input = java.io.BufferReader(new java.io.InputStreamReader(System.in));
		java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
		int value = 0;
		String ch = "";
		try{
			while(ch != "q" && ch != "Q"){
				ch = input.readLine();
				value = Integer.parseInt(ch);
				arr.add(ch);
			}
			int temp = arr.get(0);
			int size = arr.size();
			System.out.print("Array before swapping : ");
			display(arr);
			if(size>1){	
				arr.set(0, arr.get(size-1));
				arr.set(size-1, temp);
			}
			System.out.print("Array after swapping : ");
			display(arr);
		} catch(java.lang.NumberFormatException e){
			System.out.println("Invalid input, pls enter valid number");
		} catch (Exception e){
			System.out.println("Something went wrong");
		}
	}
}
