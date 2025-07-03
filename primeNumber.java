package allInOne;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		
		
		
		//int num =19;
		int count=0;
		
		if(num >1) {
			for(int i=1; i<=num; i++) {
				if(num %i==0) 
					count ++;
					}
		 if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not a prime");
			}
		}
	}
		
	}

