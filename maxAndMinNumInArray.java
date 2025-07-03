package allInOne;

public class maxAndMinNumInArray {
 
		
	public static void main(String[] args) {
		 
		int a[] = {12 ,14,15,34,64 , 34, 434};

		int max=a[0];
		int min= a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]> max) {
				max=a[i];
			}
			if(a[i] < min) {
				min =a[i];
			}
		}
		System.out.println(max+ " max values in array");
		System.out.println(min + " min values in array");
		
		
		
		
	}

}
