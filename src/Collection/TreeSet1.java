package Collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.zip.Inflater;

public class TreeSet1 {
	
public static void main(String[] args) {
	
  TreeSet  as=new TreeSet();
  
  as.add(12);         // allow only one data type information
  as.add(34);         // homogeneous in nature
  as.add(25);         // order of structure is in sequence
  as.add(65);
  
 System.out.println(as);
	
 as.remove(12);
 System.out.println();
 
 Iterator df=as.iterator();
 
 while(df.hasNext()) {
	 System.out.println(df.next());
 }
 
	
		
	}

}
