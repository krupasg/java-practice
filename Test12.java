import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*class Test12 {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		Integer i = new Integer(10);
		Character c = new Character('a');
		al.add(i);
		al.add(c);
		System.out.println(al);
	}
}

class Test12{
	public static void main(String[] args){
		ArrayList a1 =  new ArrayList();
		a1.add(10);
		a1/.add('n');
		a1.add(10.88);
		System.out.println(a1);
	}
}
class Test12{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("hi", "hello", "morning"));
		System.out.println(al);
	}
}

class Test12{
	public static void main(String[] args){
	String[] str = {"hi", "hellow", "hooo","hhhhhjjjjj", "kkkk"};
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
	al.add("hhhhhhhhhhh");
	al.add("hhh");
		System.out.println(al);
		for (String s : al) {
			System.out.println(al);
		}
	}
}
class Test12{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("hhh", "kk", "ggg"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}

class Test12{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("hi" , "Hrello", "morning"));
		LinkedList<String> l= new LinkedList<String>(al);
		l.add("arg0");
		for (String ss:l){
			System.out.println(ss);
		}
	}
}*/

class Test12 {
	public static void main(String[] args){
		LinkedList<String> l = new LinkedList<String>();
		l.add("arg0");
		l.add("arg1");
		l.add("arg2");
		for (String ss:l){
			System.out.println(ss);
		}
		LinkedLis copy = (LinkedLis)l.clone();
			System.out.println(copy);
	}
}















