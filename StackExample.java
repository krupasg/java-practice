import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("first");
		s.push("second");
		s.push("third");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.size());
		System.out.println(s.search("first"));
		System.out.println(s.search("third"));
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());
	}
}
