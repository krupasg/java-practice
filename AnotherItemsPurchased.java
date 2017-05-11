import java.util.Scanner;

/*Create 4 variables related to an item (like item no, item name, price, quantity ) as 
private and write setters and getters for them in one class. In another class, write two 
methods, one method to calculate the total purchase and the other to display the total. .
Input: Assign values to the variables(Ask user to input the values to all the 4 variables)
Output: Print the total purchase amount.*/

public class AnotherItemsPurchased {
	float total_price;

	void calculate(ItemsPurchased itemsPurchased) {
		total_price = itemsPurchased.getItemprice() * itemsPurchased.getItemquantity();
	}

	void display() {
		System.out.println("Toatal Purchase: " + total_price);
	}

	public static void main(String[] args) {
		int item_num;
		String item_name;
		float item_price;
		int item_quantity;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item number: ");
		item_num = input.nextInt();
		System.out.println("Enter the item name: ");
		input.nextLine();
		item_name = input.nextLine();
		System.out.println("Enter the item price: ");
		item_price = input.nextFloat();
		System.out.println("Enter number of items: ");
		item_quantity = input.nextInt();
		ItemsPurchased itemsPurchased = new ItemsPurchased();
		itemsPurchased.setItemname(item_name);
		itemsPurchased.setItemnum(item_num);
		itemsPurchased.setItemprice(item_price);
		itemsPurchased.setItemquantity(item_quantity);
		AnotherItemsPurchased anotherItemsPurchased = new AnotherItemsPurchased();
		anotherItemsPurchased.calculate(itemsPurchased);
		anotherItemsPurchased.display();
	}

}