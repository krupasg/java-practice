class Parent {
	void m1(){
	System.out.println("parent method");
	}
}
class Child extends Parent{
	void m1(){
	System.out.println("Child method");
	}
	void m2(){
	this.m1();
	super.m1();
	}
	public static void main(String[] args){
	new Child().m2();
	}
}