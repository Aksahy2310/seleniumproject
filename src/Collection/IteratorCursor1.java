package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorCursor1 {
	
public static void main(String[] args) {
	
	ArrayList qw=new ArrayList();
	
     qw.add(12);                         // iterator
     qw.add("Akshay");                   // listiterator
     qw.add('K');
     qw.add(21.3f);
     
    System.out.println(qw);
     
   Iterator as=qw.iterator(); // Iterator cursor can get with the iterator
                                 // method
//    
//    System.out.println(as.hasNext());     // true boolean form return
//    System.out.println(as.next());         // print o index array first
//    System.out.println(as.next().getClass());   // get class
//   
    while(as.hasNext()) {
    	
    	System.out.println(as.next());
    }
    
   //   3 function in iterator method 
    
    
    
   

    
    
    
    
    
		
	}

}
