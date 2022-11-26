package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset11 {
	
public static void main(String[] args) {
		
		HashSet qw=new HashSet();
		
		qw.add(23);
	    qw.add(23);         // duplicate value not allowed
	    qw.add(45.6f); 
		qw.add(null);       // null duplicate value not allowed
		qw.add(34);   
		qw.add(null);
		qw.add("akshay");
		qw.add('Q');
		
		System.out.println(qw);
		System.out.println(qw.contains("akshay"));     // get boolean result
		//qw.clear();                                   // clear all the data
		//System.out.println(qw);    
		qw.remove(34);                   // remove function
		System.out.println(qw);
		System.out.println(qw.isEmpty());     // boolean condition
		System.out.println(qw.size());      // get size
		
		System.out.println("using cursor print informatoion");
		
		Iterator as=qw.iterator();
		
		while(as.hasNext()) {
			System.out.println(as.next());
		}
		

		
	}

}
