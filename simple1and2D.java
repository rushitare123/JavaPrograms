 package ArraysProgram;

public class simple1and2D {

	public static void main(String[] args) {
		// 1 d arrya
		
	    /* int a[] = {23 ,23,4,54,65,56,4};

        int mix=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]>mix) {
				mix=a[i];
			}
		}System.out.println(mix);
		

		int min=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println(min);
	}
//addition of array
	 int a[] = {1 ,2,4,5};    
	     int sum1 =0;
	     for(int i=0; i<a.length; i++) {
	    	 sum1 =sum1+a[i];
	     }
	    
	     System.out.println(sum1);
	     int sum2=0;
	     for(int i=1; i<a.length; i++) {
	    	 sum2=sum2+a[i];
	     }
	     System.out.println(sum2);
	     
	     System.out.println(sum1-sum2);
	}
	*/
	
		//Print even and odd number array
		int a[] = {1,2,3,4,5,6 ,7 ,8,9,10};
		int sum=0;
		System.out.println("even number");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				
				System.out.println(a[i] );
			}
		}
		System.out.println("odd number");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 !=0) {
				System.out.println(a[i]);
			}
		}
				
		
	}
}
