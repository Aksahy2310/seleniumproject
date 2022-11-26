package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor2 {
	
public static void main(String[] args) {
	
	ArrayList gh=new ArrayList();
	
	 gh.add(23);
	 gh.add(34);
	 gh.add("akshay");
	 gh.add('A');
	 
	 System.out.println(gh);
	 
     ListIterator qw=gh.listIterator();
       
     while(qw.hasNext()) {
    	 
       System.out.println(qw.next());
     }
     
     System.out.println("print in reverse order");
     
    while(qw.hasPrevious()) {
    	
    	System.out.println(qw.previous());
    }
    System.out.println(" Print using For Loop");
      for(Object W:gh) {
    	
    	  System.out.println(W);
    	
    }
    
     
     
     
    

		
	}

}
