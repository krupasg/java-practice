import java.util.Scanner;
class DiscountOverTen {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price for an item: ");
		double price = input.nextDouble();
		if(price>10){
			double discounted_price = price - (price * 0.05);
			System.out.println("Final item price after dicount is: " + discounted_price );
		}
		else {
			System.out.println("Final item price with no dicount is: " + price );
		}
	}
}
	