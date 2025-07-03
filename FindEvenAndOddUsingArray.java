package allInOne;

public class FindEvenAndOddUsingArray {

	public static void main(String[] args) {
		 int a[] = {31 ,13,45,67,34}; 
		 	int evencount=0;
		 	int oddcount=0;
		 	
		/*	for(int i=0; i<a.length; i++) {
		 		if(a[i]%2==0) {
		 			evencount++;
		 		}
		 		else {
		 			oddcount++;
		 		}
		 	}*/
		 	//enhace forloop
		 	int sum=0;
		 	for(int value: a) {
		 		sum =sum +value;
		 		if(value%2==0) {
		 			evencount++;
		 		}
		 		else {
		 			oddcount++;
		 		}
		 	}
		System.out.println(evencount +" :is even number  in array");
		System.out.println(oddcount +": is odd number in array");
		System.out.println("sum of array is : "+ sum);

	}

}
