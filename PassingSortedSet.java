import java.util.*;

public class PassingSortedSet {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("orange");
		t.add("banana");
		t.add("apple");
		t.add("grape");
		t.add("zzz");
		System.out.println(t);
		SortedSet s = t.headSet("orange");
		TreeSet t1 = new TreeSet(s);
		System.out.println(t1);
	}
}


