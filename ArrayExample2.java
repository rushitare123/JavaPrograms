package ArraysProgram;

public class ArrayExample2 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3} , {4,5,6} ,{3, 4  ,3}};
		int b[][]={{10,25,35} , {45,55,65} ,{35, 54  ,53}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		

		for(int i=0; i<3; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
