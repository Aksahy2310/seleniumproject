package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
public static void main(String[] args) {
	
	LinkedHashSet as=new LinkedHashSet();
	
	as.add(12);
	as.add(12);          // dose't allow duplicate value
	as.add(56);
	as.add(null);          
	as.add(null);        // allow only one null value
	as.add("akshay");
	as.add('Y');
	as.add(34.5f);
	as.add(8);
	
	System.out.println(as);
	
//	;
//	System.out.println(as.remove('Y'));
//	as.remove('Y');
//	System.out.println(as);
//	System.out.println(as.isEmpty());
//	System.out.println(as.contains("akshay"));
//	as.clear();
//	//System.out.println(as);
//	System.out.println(as.size());
//	System.out.println(as);
//	
	
	Iterator qw=as.iterator();
	
	for(Object w:as) {            // using for each loop
		System.out.println(w);
	}
	
	System.out.println("using while loop");
	
	while(qw.hasNext()) {
		
		System.out.println(qw.next());
	}
	
	
	
	
	
	
	
	
	
		
	}

}
