import java.util.Scanner;

public class Operations {
	
	public static void main(String[] args){
	int a;
	int b;
Scanner input = new Scanner(System.in);
System.out.print("Enter value for A ");
a = input.nextInt();
System.out.print("Enter value for B ");
b = input.nextInt();
System.out.print("Enter the name of operation ");
input.nextLine();
String operation=input.nextLine();
if (operation.equals("addition")){
	int result = a + b;
	System.out.println(result);
}
else if (operation.equals("substraction")){
			int result = a - b;
	System.out.println(result);

	}

else if (operation.equals("multiplication")){
			int result = a * b;
	System.out.println(result);

	}

else if (operation.equals("division")){
			float result = a/b;
	System.out.println(result);
}
}
}


