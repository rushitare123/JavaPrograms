package ArraysProgram;

public class MultidimentionArray {
	
	public static void main(String[] args) {
		

		int arr[][]={{1,4,7},{2,5,8},{3,6,9}};  
		int ar[][]= {{1,2,3},{4,5,6},{1,2,4}};
		//printing 2D array 
		
		
		
		for(int i=0; i<3; i++){  
		 for(int j=0; j<3; j++){  
		   System.out.print(arr[i][j]+   "      ");  
		 }  
		 System.out.println();  
		}  
		
		System.out.println("=================");
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				System.out.print(ar[a][b]+"   ");
			}
			System.out.println();
			
		}
	}
	

}
 