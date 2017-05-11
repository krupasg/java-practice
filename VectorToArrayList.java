import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

// copying data from vector to ArrayList

public class VectorToArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(10);
		al.add(1);
		System.out.println("Arraya elements: " + al);
		Vector v = new Vector();
		v.add("hundred");
		v.add("ten");
		v.add("one");
		Collections.copy(al, v);
		System.out.println("Vector elements: "+ v);
		System.out.println("Array elements after copying vector elements to ArrayList: "+ al);

	}
}
