package allInOne;



class Demo{
	Demo(){
		System.out.println("demo is print");
	}
	
}
 class Demo1 extends Demo{
	 Demo1(){
		 System.out.println("demo1 is created");
	 }
}


 
 

public class superclass extends Demo1 {
 superclass(){
	 super();
	 System.out.println("superclass");
 }
	public static void main(String[] args) {
 
		superclass s=new superclass();
	
	}

}
