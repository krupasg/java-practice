
//Exercise 2, program to display factorial of a number

class Factorial {
	public static void main(String[] args){
		int i, fact=1;
		int fact_num =5;
		for(i=1; i<=fact_num; i++){
			fact= fact*i;
		}
		System.out.println("The factorial of fact_num is" +fact );
	}
}