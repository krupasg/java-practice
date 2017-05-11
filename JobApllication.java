
/*Create a job application form for Ebay company. Application should contains Company name(static and constant) 
and the following properties. first name, last name, age, gender,Present address,Telephone, SSN, exp. salary per month.
make SSN,Telephone,address fileds are private so that out side application form can access those variables through 
the getters and setters.*/
import java.util.*;

public class JobApllication {
	static final String COMPANY = "ebay";
	String firstName;
	String lastName;
	float age;
	String gender;
	private String presentAddress;
	private String phoneNumber;
	private String ssn;
	private float salary;

	public static void main(String[] args) {
		System.out.println(COMPANY);
	}

}
