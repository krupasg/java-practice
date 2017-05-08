class X{}
class Y{}
class Emp{}
public class Real{
	void m1(X x, Emp e){
	System.out.println("m1");
	}
	static void m2(int a,  Y y){
		System.out.println("m2");
	}
	public static void main(String[] args){
	Real r= new Real();
	X x= new X();
	Emp e = new Emp();
	r.m1(x,e);
	Y y= new Y();
	Real.m2(10, y);
	}	
	}