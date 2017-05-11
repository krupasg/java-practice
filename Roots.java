// Exxercise 3

class Roots {
	public static void main(String[] args) {
		int a = 5, b = 8, c = 2;
		double root1, root2, d;
		d = b * b - 4 * a * c;
		if (d > 0) {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The value of root1 is :" + root1);
			System.out.println("The value of root2 is :" + root2);
		} else if (d == 0) {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("The value of root1 is :" + root1);
		} else {
			System.out.println("");
		}
	}

}