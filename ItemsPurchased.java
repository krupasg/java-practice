/*Create 4 variables related to an item (like item no, item name, price, quantity ) as 
private and write setters and getters for them in one class. In another class, write two 
methods, one method to calculate the total purchase and the other to display the total. .
Input: Assign values to the variables(Ask user to input the values to all the 4 variables)
Output: Print the total purchase amount.*/

public class ItemsPurchased {

	private int item_num;
	private String item_name;
	private float item_price;
	private int item_quantity;

	public void setItemnum(int num) {
		item_num = num;
	}

	public void setItemname(String name) {
		item_name = name;
	}

	public void setItemprice(float item_price2) {
		item_price = item_price2;
	}

	public void setItemquantity(int quantity) {
		item_quantity = quantity;
	}

	int getItemnum() {
		return item_num;
	}

	String getItemname() {
		return item_name;
	}

	float getItemprice() {
		return item_price;
	}

	int getItemquantity() {
		return item_quantity;
	}
}