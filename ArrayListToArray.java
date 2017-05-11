import java.util.ArrayList;
import java.util.Arrays;
//ArrayList To Array Example
public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("hello", "java", "world"));
		String[] a = new String[al.size()];
		al.toArray(a);
		for (String s:a){
			System.out.println(s);
		}
	}

}
