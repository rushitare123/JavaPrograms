package ArraysProgram;

import java.util.Scanner;

public class dynamicarray {

	public static void main(String[] args) {
		
		System.out.println("Enter  number");
		Scanner sc=new Scanner(System.in);
		int size ,r;
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<size; i++) {
			a[i] =sc.nextInt();
		}
		for(int i=0 ; i<size; i++) {
	

			
		System.out.println(a[i]+" ");
		}
	}

}
