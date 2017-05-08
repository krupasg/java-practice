class Testc {
	void m1(int a, char c){
		System.out.println("M1 mthod");
		System.out.println(a);
		System.out.println(c);

	}
	static void m2(boolean b, float f){
		System.out.println("M2 methid");
		System.out.println(b);
		System.out.println(f);

	}
	public static void main(String[] args){
		Testc t= new Testc();
		t.m1(10, 'a');
		Testc.m2( true, 1.5f);
	}
}