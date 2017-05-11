import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// Adding collection data in to another collection
public class AddingCollections {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(Arrays.asList("hello", "pittu", 1));
		LinkedList l = new LinkedList(al);
		System.out.println(l);
	}

}
