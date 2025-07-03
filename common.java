package allInOne;

import java.util.Arrays;
import java.util.Scanner;

public class common {

	public static void main(String[] args) {
		//prime number
		//prime num is div by num it self or 1
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
	/*	
		int num =sc.nextInt();
		 
		int count=0;
		
		if(num >1) {
 			for(int i=1; i<=num; i++) {
				if(num%i==0) 
					count++;
				
				
				}if(count==2) {
					System.out.println(" this is prime number");
				}
				else {
					System.out.println("not a prime number");
				}
			
			
		} else {
			System.out.println("Please Enter valid input.....");
		}
		
		
		//palindrome number
		int num =sc.nextInt();//12321
		int rev=0;
		int org_num=num;
		
		while(num >0) {
			rev=rev*10+num%10; //12321/10=1
			num =num/10;//12321/10=1232
		}
		if(org_num==rev) {
			System.out.println(org_num +" is palindrome number ");
		}
		else {
			System.out.println(org_num +" is not a palindrome number");
		}
		
		String str=sc.next();//abcba
		String revs="";
		String org_str=str;
		
		int len=str.length();
		for(int i=len-1; i>=0; i--) {
			revs=revs+str.charAt(i);
		}
		if(org_str.equals(revs)) {
			System.out.println(org_str+" : is palindrome String");
		}
		else {
			System.out.println(org_str + " :is not palindrome String");
		}
		
		//find even number and odd number
		int num=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		int rev=0;
		
		while(num >0) {
			rev=rev*10+num%10;//1234/10=4 123/10=3+40=43
			 if(rev%2==0) {
			 evencount++;
			
		}else {
			oddcount++;
		}num =num/10;
		}System.out.println(evencount + " : is evencount ");
		System.out.println(oddcount + " : is oddcount");
		
		int even=0 , odd=0;
	int arr[] = {1 ,2 ,3,4,5 };
	 
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			even++;
		}
		else {
			odd++;
		}
	
	}
	System.out.println(even +"even   odd>"+odd );
	*/
		 
	
	}}


