package allInOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import Collection.Arraylist;

public class array {

	public static void main(String[] args) {
	int a[]  = {12 ,13, 14,15 ,16};
	
	int evencount=0;
	int oddcount=0;
	int sum =0;
	for(int i=0; i<a.length; i++) {
		if(a[i] %2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
		 sum =sum+a[i];
		
	}System.out.println(evencount +" even count ");
		System.out.println(oddcount +"  odd count");
		System.out.println(sum+ " sum of number");
	
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 list.add(12);
		 list.add(13);
		 list.add(14);
		 ListIterator itr=list.listIterator();
	while(itr.hasNext()){
		int i=(Integer)itr.next();
	
		 System.out.println(i);
		 
	}
}
}
