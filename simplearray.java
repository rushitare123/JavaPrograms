package ArraysProgram;

import java.util.Scanner;

public class simplearray {
	public static void main(String[] args) {
	/*	int a[] = { 12 ,1,2,3,4 ,4};

		for(int e :a) {
			System.out.println(e);
		}*/
		int arr[ ][ ] = { {1 ,2,3} ,{4,5,6} ,{7,8,9}};
		 for(int i=0 ;i<3 ;i++) {
			 for(int j=0; j<3; j++) {
				 System.out.print(arr[i][j] +" ");
			 }
			 System.out.println();
		 }
		  System.out.println("Enter array values");
		  Scanner sc=new Scanner(System.in);
		  int a[] =new int[5];
		   for(int i=0; i<a.length; i++) {
			   a[i] =sc.nextInt();
		   }
		   System.out.println("print array");
		   for(int i=0; i<a.length; i++) {
			   System.out.println(a[i]+" ");
		   }
		   System.out.println("array length "+ a.length);
		  
}
}
