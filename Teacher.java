class Test2{
	double m1(int a){
	System.out.println("integer");
	return 20.5;
	}
	int m1(float f){
	System.out.println("float");
	return 100;
	}
	public static void main(String[] args){
		Test t= new Test();
		double d = t.m1(10);
		System.out.println(d);
		int i=t.m1(12f);
		System.out.println(i);	
	}	
}
