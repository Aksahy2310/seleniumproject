package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {
public static void main(String[] args) {
	
	ArrayList as=new ArrayList();   // first create object of ArrayList
	
     as.add(12);
     System.out.println(as);
     as.add(12);
     System.out.println(as);        // duplicate value accepted
     as.add(33);
     System.out.println(as);        // integer value accepted
     as.add('A');
     System.out.println(as);        // character value accepted
     as.add("Akshay");
     System.out.println(as);        // string value accepted
     as.add(34.4f);
     System.out.println(as);        // float value accepted
     as.add(null);
     System.out.println(as);        // null value can accepted
     as.add(3,"vicky");
     System.out.println(as); 
     as.add(12);
     System.out.println(as);
     as.add(12);
     System.out.println(as);        // duplicate value accepted
     as.add(33);
     System.out.println(as); 
     // add "Vicky" in index position of 3
     
     System.out.println(as);
     
     
//  Iterator cursor = as.iterator();
//  for(Object obj:as) {
//	  System.out.println(as);
//  }
//     
//     System.out.println(as.size());              //  7
//     System.out.println(as.isEmpty());           // false
//     System.out.println(as.indexOf("Akshay"));   // position 4
//     System.out.println(as.remove(5));  // delete array from list 5no index
//     System.out.println(as.get(0));               // 12  find value of index
//     System.out.println(as.contains(33));         //  true
//     System.out.println(as.contains(10));         //  false
//     //  
//     
     
//     HashSet E=new HashSet(as);
//     
//     System.out.println(E);

	
	
		
	}

}
