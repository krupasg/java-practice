import java.util.HashSet;
// Insertion order is not preserved and duplicates are not allowed
public class HashSetExample {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("hello");
		h.add("java");
		h.add("arg0");
		h.add("arg1");
		h.add("arg0");
		h.add("arg0");
		h.add("arg0");
		h.add("arg0");
		h.add("arg0");
		System.out.println(h);
	}

}
