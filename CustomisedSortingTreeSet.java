import java.util.*;

public class CustomisedSortingTreeSet {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComp());
		t.add("orange");
		t.add("banana");
		t.add("apple");
		System.out.println(t);
	}
}

class MyComp implements Comparator<String> {
	public int compare(String s1, String s2) {
		// return s1.compareTo(s2);
		return -s1.compareTo(s2);
	}
}
