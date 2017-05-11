public class SwapElements {
	public static void main(String[] args) {
		String fname = "krupa";
		String lname = "s";
		
		System.out.println("Elements before swapping: ");
		System.out.println(fname);
		System.out.println(lname);
		
		swap(fname, lname);
	}

	private static void swap(String fname, String lname) {
	
		String temp = fname;
		fname = lname;
		lname = temp;
		
		System.out.println("Elements after swapping: ");
		System.out.println(fname);
		System.out.println(lname);
	}

}


