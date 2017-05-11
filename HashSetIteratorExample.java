import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetIteratorExample {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("hello");
		h.add("java");
		h.add("arg");
		Iterator<String> itr = h.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
	}

}
