package allInOne;

import java.util.HashSet;

public class m {
 
	public static void main(String[] args) {  
		  
	for(int i=5; i>=1; i--) {
		for(int j=1; j<=5-i; j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5-i; j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	for(int i=1 ; i<=4; i++) {
		for(int j=1; j<=5-i;j++) {
			System.out.print("*");
		}
		for(int j=1 ;j<=i; j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	 for(int i=1; i<=4; i++) {
		 for(int j=1; j<=i ;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	}
	 for(int i=4; i>=1; i--) {
		 for(int j=1; j<=i; j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 HashSet<Integer> set=new HashSet<>();
	 HashSet<String> str=new HashSet<>();
	 str.add("a");
	 str.add(" ");
	 str.add(null);
	 str.add(null);
	 str.add("b");
	 for(String s: str) {
		 System.out.println(s);
	 }
	 set.add(12);
	 set.add(12);
	 set.add(3);
	 
	 
	 for(int e:set) {
		 System.out.println(e); 
	 }
	}

}
