package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor3 {
	
public static void main(String[] args) {
	
    Vector nm=new Vector();
	
	nm.add(12);
	nm.add(34);
	nm.add("akash");
	nm.add('K');
	
	System.out.println(nm);
	
	System.out.println(nm.get(2));           // get value of the position
	System.out.println(nm);
	System.out.println(nm.indexOf('K'));     // find index 
	System.out.println(nm.contains(34));     // value present or not
	System.out.println(nm.size());           // get size
	System.out.println(nm.isEmpty());        // false
	System.out.println(nm);
	
	Enumeration cv=nm.elements();
	
	while(cv.hasMoreElements()) {
		
		System.out.println(cv.nextElement());
			}
	System.out.println(" print using for loop");
	
	for(Object b:nm) {
		
		System.out.println(b);
	}
		
	}

}
