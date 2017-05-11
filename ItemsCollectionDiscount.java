import java.util.Scanner;

class ItemsCollectionDiscount {

	double cookie_price = 0.05; // 5cents is equal to $0.05
	double cake_price = 0.03; // 3 cents is equal to $0.03

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cookies:");
		int num_cookies = input.nextInt();
		System.out.println("Enter number of cakes:");
		int num_cakes = input.nextInt();
		double cookies_total = num_cookies * 0.05;
		double cakes_total = num_cakes * 0.03;
		double items_total = cookies_total + cakes_total;
		System.out.println("Items total value :" + items_total);
		if (items_total > 10) {
			double final_total = items_total - (items_total * 0.05);
			System.out.println("Total value after 5% discount is:" + final_total);
		} else {
			System.out.println("Total value before 5% discount is:" + items_total);
		}
	}
}