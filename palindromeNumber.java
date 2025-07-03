package allInOne;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {


		System.out.println("Enter any  number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int org_num =num;
		int rev= 0;
		
		while(num >0) {
			rev=rev*10+num%10; //12321/10= 1 //1232/10=2 //123/10=3
			num =num/10; //12321/10=1232 //1232/10=123 //123/10=12
			
		}
		if(org_num ==rev) {
			System.out.println(org_num+ ":is palindrome number");
		}
		else {
			System.out.println(org_num + "is not a palindrome number");
		}
		


	}

}
