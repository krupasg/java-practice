import java.util.Scanner;

class Discount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price for an item");
		double price = input.nextDouble();
		double discounted_price = price - (price * 0.05);
		System.out.println("Final item price after the dicount is: " + discounted_price);
	}
}
