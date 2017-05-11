import java.util.Comparator;
import java.util.TreeSet;

public class ReverseStringTreeSet {
		public static void main(String[] args) {
			TreeSet<String> t = new TreeSet<String>(new MyCompar());
			t.add("orange");
			t.add("banana");
			t.add("apple");
			System.out.println(t);
		}
	}

class MyCompar implements Comparator<String>{
	public int compare(String s1, String s2){
		return s2.compareTo(s1);
		//or
		//return -s1.compareTo(s2);
	}
}