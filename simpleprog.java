package ArraysProgram;

import java.util.Scanner;

public class simpleprog {

	public static void main(String[] args) {

	/*	System.out.println("Enter  rollNO");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		System.out.println("enter Student name");
		String str=sc.next();
		System.out.println("enter fees of student");
		float f=sc.nextFloat();
		System.out.println("Enter subject name");
		String sub=sc.next();
		
		
	//	System.out.println(str);
		//System.out.println(num );
	//	System.out.println(f);
		
		System.out.println("data is successfuly uploded");
		*/
		for(int i=1; i<=4 ; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
