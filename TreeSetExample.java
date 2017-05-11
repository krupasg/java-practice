import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("a");
		t.add("z");
		t.add("k");
		t.add("g");
		t.add("b");
		t.add("l");
		System.out.println(t);

		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(null);
		System.out.println(t1);

	}

}
