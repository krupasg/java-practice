

import java.util.Vector;

public class MyFirstVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		 System.out.println(v.capacity()); // initial capacity of Vector
		 v.add("java");
		 System.out.println(v);
		 System.out.println(v.size()); 
	}
	
}


// Example showing vector size is doubled once it reaches its maximum capacity


class MyFirstVector{
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>(4);
		v.add("java");
		v.add("string");
		v.add("java2");
		v.add("string2");
		System.out.println(v.capacity());
		v.add("5th element");
		System.out.println(v.capacity());
		System.out.println(v.size());
	}
}

// vector with initial capacity and increment capacity

class MyFirstVector {
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>(2,4);
		v.add("fist");
		v.add("second");
		v.add("third");
		v.add("fourth");
		v.add("third");
		v.add("fourth");
		v.add("fourth");
		v.add("third");
		v.add("fourth");
		v.add("third");
		v.add("fourth");
		
		System.out.println(v.capacity());
	}
}