package ArraysProgram;

import java.util.Scanner;

public class FindNumberByUsing2DArray {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int col=sc.nextInt();
		  int [][]numbers =new int [row][col];
		  for(int i=0; i<row; i++) {
			  for(int j=0; j<col; j++)
			  {
				  numbers[i][j] =sc.nextInt();
				  
				  }
			  }
      
		  int x=sc.nextInt();
	      for(int i=0; i<row; i++) {
		  for(int j=0; j<col; j++) {
			  if(numbers[i][j]==x) {
				  System.out.println("x found at location:"+i+"  "+j);
			  }
		  }	  }
	  }

}
