class Test2{
	double m1(int a, int b){
	System.out.println("integer");
	return 20.5;
	}
	int m1(float f){
	System.out.println("float");
	return 100;
	}
	public static void main(String[] args){
		Test2 t= new Test2();
		double d = t.m1(10,20);
		System.out.println(d);
		int i=t.m1(12f);
		System.out.println(i);	
	}	
}
