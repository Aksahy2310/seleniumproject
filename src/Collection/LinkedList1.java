package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	
public static void main(String[] args) {
	
	LinkedList qw=new LinkedList();
	
	qw.add(12);
	qw.add(24);
	qw.add(21);
	qw.add(45);
	qw.add(10);
	
	System.out.println(qw);
//	System.out.println(qw.size());
//	System.out.println(qw.isEmpty());
//	System.out.println(qw.indexOf(24));
	
//	Iterator sd=qw.iterator();
//	   while(sd.hasNext()) {
//		System.out.println(sd.next());
//	}
	
	ListIterator zx=qw.listIterator();
//	
//	while(zx.hasNext()) {
//		System.out.println(zx.next());
//	}
//	System.out.println("print in reverse direction");
	
//	while(zx.hasPrevious()) {
//		System.out.println(zx.previous());
//	}
//	System.out.println("changes in method");
	
	while(zx.hasNext()) {
		int i=zx.nextIndex();
		if(i<20) {
			zx.remove();
			
			
		}
		
	
	}}}


