package allInOne;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		System.out.println("Enter any String ");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String org_str=str;
		String rev ="";
		
		int len=str.length();
		for(int i=len-1; i>=0 ; i--) {
			rev= rev+str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str +" :is palindrome String");
			
		}
		else {
			System.out.println(org_str +" : is not a palindrome String ");
		}
			
				
	}

}
