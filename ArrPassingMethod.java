package ArraysProgram;

public class ArrPassingMethod {

	static void min(int arr[]) {
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)  
			 if(min>arr[i])  
			  min=arr[i];  
		System.out.println(min);
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int a[]= {333,4,5,5};
		min(a);
	}

}
