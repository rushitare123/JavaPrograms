package allInOne;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	 int num =12321;
	 int org_num=num;
	 int rev=0;
	 
	 while(num >0) {
		 rev=rev*10+num%10; //12321%10=1
		  num=num/10;
		 
	 }
	 if(org_num ==rev) {
	 System.out.println(org_num+" :is palindrome number");
	 }else {
	 System.out.println(org_num +" : is not a palindrome number");
	 }
	 
	 //String
	 System.out.println(" enter any String values");
	 Scanner sc=new Scanner(System.in);
	 
	 
	 String str=sc.next();
	 String org_str=str;
	 String revs="";
	 
	 int len=str.length();
	 for(int i=len-1; i>=0; i--) {
		 revs=revs+str.charAt(i);
	 }
	 if(org_str.equals(revs)) {
		 System.out.println(org_str+" : is palindrome String");
	 }
	 else {
		 System.out.println(org_str+" : is not palindrome String");
	 }
	 
	 }
		
	}


