import java.util.Scanner;

class AssignVolunteer {
	public static void main(String[] args) {
	int donationType;
	final int CLOTHING_CODE =1;
	String volunteer;
	final int OTHER_CODE =2;
	final String CLOTHING_PRICER="Regina";
	final String OTHER_PRICER = "Marco";
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 1 or 2 for donation type");
	System.out.println("Enter"+CLOTHING_CODE +"for clothing" + OTHER_CODE + "for other " );
	donationType=input.nextInt();
	if (donationType==CLOTHING_CODE){
		volunteer = CLOTHING_PRICER;
	}
		else {
		volunteer = OTHER_PRICER;
		}
	System.out.println(donationType);
	System.out.println(volunteer);
	}
}