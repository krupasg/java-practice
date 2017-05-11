// Exercise1

class Payroll {
	public static void main(String[] args) {
		double hours_worked = 30.5;
		double pay_per_hour = 20.5;
		double pay_per_month = hours_worked * pay_per_hour;
		System.out.println("Number of working hours:" + hours_worked);
		System.out.println("Payrate per hour:" + pay_per_hour);
		System.out.println("Total Salary for month:" + pay_per_month);
	}
}
