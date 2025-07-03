package allInOne;

 
class Parent {
 
	String name;
	
	void m1() {
		System.out.println("this is m1 parent method");
	}
}

//Child class
class Child extends Parent {
  int a;
  void m1() {
	  System.out.println("this is m1 child class method");
  }
	
}

 
public class GFG {

 
 public static void main(String[] args)
 {
     // Upcasting
     Parent p = new Child();
     p.name="rushi";

     System.out.println(p.name); 
     p.m1();

     // Trying to Downcasting Implicitly
     // Child c = new Parent(); - > compile time error

     // Downcasting Explicitly
     Child c = (Child)p;
    
     System.out.println( c.a=12);
    System.out.println(c.name);
    c.m1();     
/*
     c.id = 1;
     System.out.println(c.name);
     System.out.println(c.id);
     c.method();
     */
 }
}