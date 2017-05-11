import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> h = new LinkedHashSet<String>();
		h.add(" ");
		h.add("Hello");
		h.add("java");
		h.add("and");
		h.add("selenium");
		h.add("selenium");
		h.add(" ");
		h.add(" ");
		Iterator<String> itr = h.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(h);
		}
		
		
	}

}
