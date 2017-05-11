import java.util.LinkedList;

public class LInkedList {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("h");
		l.add("e");
		l.add("l");
		l.add("l");
		l.add("o");
		l.add("j");
		l.add("a");
		l.add("v");
		l.add("a");
		System.out.println(l);
		// add elements at first and last place
		l.addLast("last");
		l.addFirst("first");
		System.out.println(l);
		// remove first element
		l.removeFirst();
		System.out.println(l);
		// remove particular element
		l.remove("h");
		System.out.println("LinkedList after removing h from the list: " + l);
		// get values using get()
		String val = l.get(7);
		l.set(4, val);
		System.out.println("LinkedList after replacing 4th index with 7th index: " + l);
	}

}
