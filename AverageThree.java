// Exercise 6
class AverageThree {

	public static void main(String[] args) {
		int i;
		int sub1 = 60;
		int sub2 = 80;
		int sub3 = 55;
		int sub4 = 66;
		int sub5 = 89;
		int sub6 = 83;
		int sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		int avg = sum / 6;
		for (i = 0; i < 3; i++) {
			System.out.println("Average performance of the student is" + avg);
		}
	}
}