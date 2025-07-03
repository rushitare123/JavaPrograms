package ArraysProgram;

public class simpleArrayprogram {

	public static void main(String[] args) {

		//int mark[] = { 86 ,85 ,99, 45, 59};
		//for(int i=0; i<=4; i++) {
		//	System.out.println("mark is : "+mark[i]);
		//}
		
		int arr[][] = {{1,2,3} ,{4,5,6}, {7,8,9}};
		

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
