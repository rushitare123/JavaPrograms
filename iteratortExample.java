package allInOne;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

public class iteratortExample {

	public static void main(String[] args) {
	/*	 List l=new ArrayList();
		 l.add(1);
		l.add("");
		 //l.add("");
		 
		 //Iterator example
		Iterator itr=l.iterator();
		 while(itr.hasNext()) {
			 
			//	System.out.println( itr.next());
				//System.out.println(itr.n);
 			  
		 }*/
	
		 List l1=new ArrayList();
		 l1.add(12);
		 l1.add(13);
		 l1.add(14);
		 ListIterator i=l1.listIterator();
		 while(i.hasNext()) {
			 			 System.out.println(i.nextIndex());
             System.out.println(i.next());
			 
		 }
	/*	 while(i.hasPrevious()) {
			 System.out.println(i.previous());
			 System.out.println(i.hasPrevious());
		 }
		 */
		 
	/*	 //ListIterator example
		 ListIterator itr=l.listIterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }


while(itr.hasPrevious())
{
	System.out.println(itr.previous());
	}


		 Vector d=new Vector();
		 d.add(10);
		 d.add("ram");
		 d.add("raj");
		 
		 Enumeration e= d.elements();
 		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }

 		*/ 
		 
		 Map m=new HashMap();
		 
		 m.put(1, "ram");
		 m.put(2, "null");
		 m.put(3, "raj");
		 
		 System.out.println(m);
		 
		 
	 Iterator <Map.Entry<Integer, String>> itr= m.entrySet().iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
}
}