import java.util.Scanner;

class Compare {
	public static void main(String[] args) {
		String firstname = "Krupa";
		String secondname;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter secondname");
		secondname = input.nextLine();
		if (firstname == secondname)
			System.out.println("equality");
		else
			System.out.println("not equal");

	}

}