import java.util.LinkedList;

public class LinkedListCloning {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("selenium");
		list.add("jira");
		list.add("testing");
		System.out.println("LinkedList before cloning: " + list);
		LinkedList copy = (LinkedList) list.clone();
		System.out.println("LinkedList after cloning: " + copy);
	}
}