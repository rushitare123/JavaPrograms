package ArraysProgram;

import java.util.Arrays;

public class copyArrayintoAnother {

	public static void main(String[] args) {


		int arr[]=new int [4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		int[]b=new int[4];
		//revers copy and print
		/*
		for(int i=3, j=0; i>=0; i--) {
			b[j]=arr[i];
		j++;
		}*/
		
		//only copy and peast
		for(int i=0, j=0; i<=3; i++) {
			b[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}

}
