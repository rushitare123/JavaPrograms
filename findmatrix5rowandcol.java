package ArraysProgram;

import java.util.Scanner;

public class findmatrix5rowandcol {

	
	public static void main(String[] args) {
		System.out.println("Enter any numbers");
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int col=sc.nextInt();
		
		int [][]numbers = new int[row][col];
		
		
		for(int i=0; i<row;   i++) {
			for(int j=0; j<col; j++) {
				numbers[i][j]=sc.nextInt();
				 
			}
		}
		for(int i=0; i<row;   i++) {
			for(int j=0; j<col; j++) {
				System.out.print(numbers[i][j]+ "");
			}System.out.println();
		}
	}

}
