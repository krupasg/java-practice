class Contructor {
	int a, b;
	double result;

	void addition() {
		result = a + b;
		System.out.println("Sum of a + b: " + result);
	}

	void substraction() {
		result = a - b;
		System.out.println("Substraction of a - b: " + result);
	}

	void multiplication() {
		result = a * b;
		System.out.println("Multiplication of a*b: " + result);
	}

	Contructor(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Contructor c = new Contructor(3, 8);
		c.addition();
		c.substraction();
		c.multiplication();
	}

}