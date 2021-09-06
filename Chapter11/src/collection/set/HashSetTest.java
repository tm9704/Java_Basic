package collection.set;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Kim");
		set.add("Lee");
		set.add("Park");
		set.add("Kim");
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
