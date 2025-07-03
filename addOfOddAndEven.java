package allInOne;

import java.util.Scanner;

public class addOfOddAndEven {

	public static void main(String[] args) {
		 System.out.println("Enter any  number");
		 
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int rev = 0;
		 
		 int evencount=0;
		 int oddcount=0;
		 
		 while(num >0) {
			 rev=rev*10+num%10; //1234/10=4
			 if(rev%2==0) {
				 evencount++;
			 }
			 else {
				 oddcount++;
			 }
			 num=num/10;//=1234/10=123
		 }
		 System.out.println(evencount+":is even number");
		 System.out.println(oddcount+ " :is odd number");
				 
	}

}
