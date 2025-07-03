package ArraysProgram;

public class multidimensional {

	public static void main(String[] args) {

		int arr[ ] [ ]  = {  {1 ,2,3 } , { 4,5,6} , {7 ,8,9}  };
		int arr1[][] = {{12,13,14}, {11 ,31, 13} , {54,7,67,}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
			
			System.out.print(arr[i] [j] +" ");
			
			 
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3 ;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
