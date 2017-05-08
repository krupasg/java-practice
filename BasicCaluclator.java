import java.util.Scanner;
class BasicCaluclator {
	static int a;
	static int b;
	static String addition = "addition";
	static String substraction = "substraction";
	static String multiplication = "multiplication";
	static String division = "division";
	static String operation;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter valu for a: ");
		a = input.nextInt();
		System.out.println("Enter valu for b: ");
		b = input.nextInt();
		System.out.println("Enter the operation name: ");
		input.nextLine();
		operation = input.nextLine();
		if(operation.equals(addition)){
			int result = a + b;
			System.out.println("Addition of a and b :  " + result);
		}
		else if(operation.equals(substraction)){
			int result = a - b;
			System.out.println("Substraction of a and b :  " + result);
		}
		else if (operation.equals(multiplication)){
			int result = a*b;
			System.out.println("Multiplication of a and b :  " + result);
		}
		else if (operation.equals(division)){
			double result = a/b;
			System.out.println("Division of a and b :  " + result);
		}
	
	}
}