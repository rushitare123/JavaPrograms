package ArraysProgram;

import java.util.Scanner;

public class simple2dArray {

	public static void main(String[] args) {
		
	/*	int arr[][]  =  {{1,2,3} ,{4,5,6},{7,8,9}};
		int arr1[][] = {{12,13,14},{11,22,33},{44,55,66}};
		
 		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
			
			System.out.print(arr[i][j]+" " );
			
		}System.out.println();
 		
		}for(int i1=0; i1<3; i1++) {
			for(int j1=0; j1<3; j1++) {
				System.out.print(arr1[i1][j1]+" ");
			}
			System.out.println();
		}
		
		   for(int i=1; i<=4; i++) {
			   for(int j=1; j<=5-i; j++) {
				   System.out.print(" ");
			   }
			   for(int j=1 ;j<=i; j++) {
				   System.out.print("* ");
			   }System.out.println();
			   */
			   for(int i=4; i>=1; i--) {
				   for(int j=1; j<=i; j++) {
					   System.out.print(" *");
				   }
				   System.out.println();
				   
			   }
			    for(int i=4; i>=1; i--) {
			    	for(int j=1; j<=4-i; j++) {
			    		System.out.print(" ");
			    		
			    }
			    	for(int j=1; j<=i; j++) {
			    		System.out.print("*");
			    	}System.out.println();
			    	}
		   }
	}

