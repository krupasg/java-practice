class JoinStrings {
	public static void main(String[] args) {
		// Join Strings
		/*
		 * String one = "Event Handler's is dedicated"; String two =
		 * "to making your event"; String three = "a most memorable one";
		 * System.out.println(one); System.out.println(two);
		 * System.out.println(three); System.out.println(one + " "+ two + " " +
		 * three);
		 */

		// Compare StringBuilder program
		StringBuilder firstBuilder = new StringBuilder("Hello");
		StringBuilder secondBuilder = new StringBuilder("Hello");
		System.out.println(firstBuilder == secondBuilder);
		System.out.println(firstBuilder.equals(secondBuilder));
		System.out.println("A  " + "B");
		System.out.println('A' + 'B');

	}
}