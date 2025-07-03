package ArraysProgram;

public class siimple {

	public static void main (String [] args) {
		
		int a[] =new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int list: a) {
			System.out.println(list);
		
			int b [][] = {{1,2},{3,4}};
			int c[] = {5,4,3,2,1};
			//System.out.println(b[1]);
			//System.out.println(b);
		   for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int data1:c) {
				System.out.println(data1);
			}
			
		}
		System.out.println("==========");
		
		int number[] = {1,2,3,4,5};
		
		
		//for(int i=0; i<=5; i++) {
			//System.out.println(number[i]+" ");
			
		//}
		for(int i=5; i>=1; i++) {
			System.out.println(number[i]+" ");
		}
		
		
		
	}

	}
