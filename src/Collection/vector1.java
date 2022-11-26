package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {
	
public static void main(String[] args) {
	
	Vector nm=new Vector();
	
	nm.add(12);
	nm.add(34);
	nm.add("akash");
	nm.add('K');
	
	System.out.println(nm);
	
//	System.out.println(nm.get(2));           // get value of the position
//	System.out.println(nm);
//	System.out.println(nm.indexOf('K'));     // find index 
//	System.out.println(nm.contains(34));     // value present or not
//	System.out.println(nm.size());           // get size
//	System.out.println(nm.isEmpty());        // false
//	System.out.println(nm);
	
//	Enumeration cv=nm.elements();
//	
//	while(cv.hasMoreElements()) {
//		
//		System.out.println(cv.nextElement());
//			}
//	System.out.println(" print using for loop");
//	
//	for(Object b:nm) {
//		
//		System.out.println(b);
//	}
//	
//	System.out.println("print using Iterator cursor");
//	
	Iterator rt=nm.iterator();
	
	while(rt.hasNext()) {
		System.out.println(rt.next());
	}
//		
	System.out.println("print using Listiterator cursor");
	
	ListIterator ty=nm.listIterator();
			
	while(ty.hasNext()) {
		System.out.println(ty.next());
	}
	System.out.println("print in reverse Order");
	while(ty.hasPrevious()) {
		System.out.println(ty.previous());
	}
				
				
			
	}

}
