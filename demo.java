package ArraysProgram;

 import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class demo {

	 
	public static void main(String[] args) {
		 
		 
		
		System.out.println();
		//left hand pyrimid
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//right hand pyramid
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverted left hand pyramid
		
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverted right hand pyramid
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//trangal
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//upword trangal
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any input");
	
		 
		

 //autoboxing(wrapper classes)
		//autoboxing -primitive to obj
	/*	int i=100;
		Integer obj=Integer.valueOf(i);
		Integer obj1=i;
		System.out.println(obj1);
		System.out.println(obj+obj1);
		
    
		
		//obj to prim
		Integer obj=new Integer(100);
		int i=obj.intValue();
		System.out.println(i);
		int j=obj;
		System.out.println(i+j); 
		
		
		 //find out duplicate element in array and max and min
		int arr[] = {12,13,14,15,16,14,16,17};
		boolean flag=false;
		int max=arr[0];
		int min =arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i] <min ) {
				min =arr[i];
			}
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i] +" : this is a duplicate element");
				flag=true;
				}
			}
		}System.out.println(max +" : is maximum number in arrya");
		System.out.println(min +"  :is minimum number in array");
		if(flag==false)
			System.out.println("Duplicate element is not found");
		 

		
	    //prime number
		int num=sc.nextInt();
		int count=0;
		
		if(num >1) {
			
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("this is a prime number");
			}else {
				System.out.println("this is not a prime number");
			}
			
			
		}else {
			System.out.println("pleace enter valid number");
		}
		
		
		
		//palindrome String
		int num=sc.nextInt();
		int org_num=num;
		int re=0;
		
		while(num>0) {
			re=re*10+num%10;
			num=num/10;
		}
		if(org_num==re) {
			System.out.println(org_num +" :is palindrome number");
		}else {
			System.out.println(org_num +" :is not a palindrome number");
		}
		
		  
		
		//anagram program
		System.out.println("Enter first name");
		String s1=sc.next();
		System.out.println("Enter second name");
		String s2=sc.next();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("This is an anagram");
		}
		else {
			System.out.println("This is not an anagram");
		}
		
		
		
		//find duplicate element in array
		int arr[] = {12,13,14,14,15,16};
		boolean flag=false;
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found duplicate array is :"+arr[i]);
				flag=true;
				}
			}
		}System.out.println(max +" :is maximum array ");
		System.out.println(min +" :is minimum array");
		if(flag==false) {
			System.out.println("not a found duplicate element in array");
		}
		
		
		 //fibonacci
		int n1=0; int n2=1; 
		int sum=0;
		
		System.out.print(n1  +" "+n2);
		for(int i=2; i<=10; i++) {
			sum=n1+n2;
			System.out.print(" "+sum );
			n1=n2;
			 n2=sum;
		}	
			
		
		
		//copy array 1 to array 2
		 int arr1[]=new int[3];
		 arr1[0]=1;
		 arr1[1]=2;
		 arr1[2]=3;
 
		 int arr2[]=new int[3];
		 for(int i=2 ,j=0 ;i>=0; i--) {
			 arr2[j]=arr1[i];
					 j++;
		 }
	
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));
		 
	   
		 //String is inmutable
		String str=new String("welcome");
		str.concat("to selenium");
		System.out.println(str);
		
		//StringBuilder - mutable
		StringBuilder b=new StringBuilder("welcome");
b.append(": to selenium");

System.out.println(b);

	//StringBuffer- mutable
      StringBuffer bu=new StringBuffer("welcome");
      bu.append(": to selenium elipcs id");
      System.out.println(bu);
*/ 
		
	 //Triangle
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		
		//inverted triangle
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		
		//left side pyramid
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		//right side pyramid
		for(int i=1; i<=4; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		} 
		
		//lefthand inverted pyramid
		
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//righthand side inverted pyramid
		
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverted pyramid
		for(int i=4; i>=0; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		
		 // trangal 
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4-i;j++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//upword trangal
		for(int i=4; i>=0;i--) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	
		/*
	        //String s="software testing";
	        String s="date";
	        char ch1[]=s.toCharArray();
	        
	        HashSet<Character>set=new HashSet<Character>();
	        HashSet<Character>set1=new HashSet<Character>();
	        for(char c:ch1) {
	        	if(set.add(c)==false) {
	        		if(set1.add(c)==true) {
	        			
	        			System.out.println("found duplicate ===="+c);
	        		} 
	        		    
	        		else{
	        		System.out.println(" ==not found duplicate======="+c);
	        	}
	        	}
	        	
	        	 
	        }
		            	/*
 	        for(int i=1; i<=100; i++) {
	        	if(i%10==0) {
	        		System.out.println(i);
	        	}
	        }
 	        */	
	 // in string we find singal charter 
		 String string1 = "software testing";  
	        int count;  
	          
	        //Converts given string into character array  
	        char ch[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <ch.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <ch.length; j++) {  
	                if(ch[i] == ch[j] && ch[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    ch[j] = '0';
 	                }
 	            }   
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && ch[i] != '0') {  
	                System.out.println(ch[i] );
	            
	            } 
	             
	        }  
 
 	      
	        
	        String str="india is my country";
	        char ch1[]=str.toCharArray();
	        
	        HashSet<Character> set=new HashSet<>();
	        HashSet<Character>set1=new HashSet<>();
	        
	        for(char c:ch1) {
	        	if(set.add(c)==false) {
	        		if(set1.add(c)==true) {
	        			System.out.println("found duplicate character is:"
	        					+c);
	        		}
	        	}
	        }
	        
	        System.out.println("=============");
	        //in String find duplicate charachter 
	        String s="india is my country";
	        char ch2[]=s.toCharArray()
;
	        int con=1;
	        int count1;
	        for(int i=0; i<s.length(); i++) {
	          
	        	if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
	        		con++;
	        	}
	        	
	        count1=1;
	        	for(int j=i+1; j<s.length(); j++) {
	        		if(ch2[i]==ch2[j] && ch2[i]!=' ') {
	        			count1++;
	        			ch2[j]='0' ;
	        		}
	        	}
	        	if(count1>1 &&ch2[i]!='0') {
	        		System.out.println(ch2[i] +":is repted char");
	        	}
	        }
	        System.out.println("count of words is :"+con);
	        
 	        
 	        
	}}
