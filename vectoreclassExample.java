package allInOne;

 import java.util.Enumeration;
 import java.util.Vector;

public class vectoreclassExample {

	public static void main(String[] args) {
		Vector d=new Vector();
 		d.add(10);
		d.add("ram");
		d.add("raj");
		Enumeration e=d.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
