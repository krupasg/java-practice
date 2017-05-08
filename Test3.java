import java.util.Scanner;
import java.util.ArrayList;
class Test3 {
	static int a;
	
	public static void main(String[] args){
	Test3 t= new Test3();
	System.out.println(t.a);
	System.out.println(Test3.a);
	System.out.println(a);
	}
	
} 
// Example 2
/*class Test4 {
	m1(){
		
	}
	public static void main(String[] args){
		System.out.println("main method");
		Test4 t = new Test4();
		t.m1();
		
	}
	
}*/

// 3
class Test5 {
	void m1(){
	System.out.println("m1 method");
	}
	void m1(int a){
	System.out.println("m2 method");
	}
	public static void main(String[] args){
		System.out.println("main method");
		Test5 t = new Test5();
		t.m1(10);	
	}
}
//4
/*class Test6 {
	void m1(){
		void m2(){
		System.out.println("main method");
		}
		System.out.println("main method");
	}
	public static void main(String[] args){
		System.out.println("main method");
		Test6 t = new Test6();
		t.m1(10);	
	}
}*/

//5
class Test7{
	public static void main(String[] args){
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("enter values");
		for (int i=0; i<a.length; i++){
			System.out.println("enter "+i+" value");
			a[i]= input.nextInt();
		}
		//for (int aa:a){
			
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}
//6 array example adding abjects in to array
class Test8{
	public static void main(String[] args){
		int[] a= new int[5];
		a[0]=10;
		for(int a1:a){
			System.out.println(a1);
		}
		Emp e1 = new Emp ();
		Emp e2 = new Emp ();
		Emp e3 = new Emp ();
		Emp[] e = new Emp[5];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		for (Emp ee:e){
			System.out.println(ee);
		}
	}
}

//Example 7
class Test9 {
	int a= 10;
	public static void main(String[] args){
		Test9 t = new Test9();
		System.out.println(t.a);
	}
}
//Example 8

class Test10 {
	int m1(int a, char ch){
		System.out.println("m1 method");
		return 0;
	}
	boolean m2(int b, boolean bb){
		System.out.println("m2 method");
		return false;
	}
	String m3(int c, double d){
		m2(1, false);
		System.out.println("m3 method");
		return "fal";
	}
	public static void main(String[] args){
		Test10 t= new Test10();
		t.m1(10, 'a');
		t.m2(20, false);
		t.m3(1, 3.4);
	}
}
// Example 10 print return value
class Test11{
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	public static void main(String[] args){
		Test11 t = new Test11();
		System.out.println("m1 method " + t.m1());
	}
}
// Example 11 recursive method

class RecursiveMethod {
	 void recursive(int a){
		System.out.println(a);
		if (a==0){
			return;
		}
		recursive(--a);
	}
	public static void main(String[] args){
		RecursiveMethod r = new RecursiveMethod();
		r.recursive(1);
	}
}
//Example 12 

class Test12 {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		Integer i = new Integer(10);
		Character c = new Character('a');
		al.add(i);
		al.add(c);
		System.out.println(al);
	}
}
// Primitive data in to arraylist autoboxing

class Test13{
	public static void main(String[] args){
		ArrayList a1 =  new ArrayList();
		a1.add(10);
		a1.add('n');
		a1.add(10.88);
		System.out.println(a1);
	}
}

// Generic version of ArrayList
/*class Emp {
	int eid;
	String ename;

	Emp(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
}
class Test14 {
	public static void main(String[] args){
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(12,"krupa"));
		al.add(new Emp(13, "krupa2"));
		al.add(new Emp(24, "krupa3"));
		for(Emp o:al){
		System.out.println(e.eid  +".......   "+e.ename);	
		}
		}
}*/

//asList example ArrayList
class Test14{
	public static void main(Striung[] args){
		ArrayList<String> al = new ArrayList<String>(
		Arrays.asList("hi", "hello", "morning"));
		System.out.println(al);
	}
}













