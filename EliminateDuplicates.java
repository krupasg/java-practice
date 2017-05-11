import java.util.ArrayList;
import java.util.TreeSet;

// Eliminate duplicates using TreeSet
public class EliminateDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(4);
		l.add(1);
		l.add(5);
		System.out.println(l);
		TreeSet<Integer> t = new TreeSet<Integer>(l);
		System.out.println(t);
	}
}
