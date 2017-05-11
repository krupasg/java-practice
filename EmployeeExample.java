import java.util.Scanner;

/*Ask the user to enter the employees of the company until the user says No and display all the employee names.

Like this... 

Do you want to add the Employee: Yes
Name of the employee:  (This should be asked only when user enter "Yes" on above line.

On clicking "No", you should display all entered employee names*/


public class EmployeeExample {
	public static void main(String[] args){
		boolean yes = true;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter employee name: ");
			String employee = input.nextLine();
			System.out.println("Do you want to add another employee?: ");
			String y = input.nextLine();
			
		} while(yes = false) ;
		System.out.println(employee);
		
	}

}

