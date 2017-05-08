class ShortCircuitTestAnd {
	public static void main(String[] args) {
	if(falseMethod()||trueMethod())
		{
		System.out.println("both are true");
		}
		else {
		System.out.println("both are not true");	
		}
	}
	public static boolean trueMethod(){
		System.out.println("True method");
		return true;
	}
	public static boolean falseMethod(){
		System.out.println("False method");
		return false;
	}
}