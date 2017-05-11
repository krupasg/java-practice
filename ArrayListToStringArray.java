import java.util.ArrayList;
import java.util.Arrays;

// ArrayList To StringArray by using toArray() 
public class ArrayListToStringArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("java", "selenium", "coding"));
		String[] a = new String[al.size()];
		al.toArray(a);
		for (String s : a) {
			System.out.println(s);
		}
	}
}
