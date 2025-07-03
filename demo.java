
package allInOne;

 import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.Integer;
import java.util.List;

import java.util.Scanner;
import java.util.Vector;

public class demo {
 
	static int a;
	final int b=0;
	public void m1() {
 			System.out.println(b);
 		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
 	     System.out.println("Enter any number");
 /*
	     //wap find duplicate number in array and max and min number
	     int arr []= {12,13,14,15,14,16,17};
	     boolean flag=false;
	     int min=arr[0];
	     int max=arr[0];
	     
	      
	     for(int i=0; i<arr.length; i++) {
	    	 if(arr[i] <min) {
	    		 min=arr[i];
	    	 }
	    	 if(arr[i]>max) {
	    		 max=arr[i];
	    	 }
	    	 for(int j=i+1; j<arr.length; j++) {
	    		 if(arr[i] ==arr[j]) {
	    			 System.out.println(arr[i] +" :is found duplicate element");
	    		 flag=true;
	    		 }
	    	 }
	     }System.out.println(min +" :is minimum number in array");
	     System.out.println(max +" :is maximum number in array");
	     if(flag==false)
	    	 System.out.println("dupilcate element is not found");
	     
	     
	     //wap print prime number or not
	     int num=sc.nextInt();
	     int count=0;
	     
	     if(num >1) {
	    for(int i=1; i<=num; i++) {
	    	
	    	if(num%i==0) {
	    		count++;
	    	}
	    }if(count==2) {
	    	System.out.println("this is a prime number");
	    }
	    else {
	    	System.out.println("this is not a prime number");
	    }
	     }
	     
	     
	     //palindrome number
	     int num=sc.nextInt();
	     int org_num=num;
	     int re=0;
	     
	     while(num>0) {
	    	 re=re*10+num%10;
	    	 num=num/10;
	     }
	     if(org_num==re) {
	    	 System.out.println(org_num+" :is palindrome number");
	     }else {
	    	 System.out.println(org_num+" :is not a palindrome number");
	     }
	     

	     //palindrome string
	     String str=sc.next();
	     String org_str=str;
	     String re="";
	     
	     
	     int len=str.length();
	     
	     for(int i=len-1; i>=0; i--) {
	    	 re=re+str.charAt(i);
	     }
	     if(org_str.equals(re)) {
	    	 System.out.println(org_str+ ":this is an palindrome string");
	    	 
	     }else {
	    	 System.out.println(org_str +" :is not a palindrome string");
	     }
	     
	     //anagram program
	     String str=sc.next();
	     String str1=sc.next();
	     
	     str=str.toLowerCase();
	     str1=str1.toLowerCase();
	     
	     char ch[] =str.toCharArray();
	     char ch1[] =str.toCharArray();
	     
	     Arrays.sort(ch);
	     Arrays.sort(ch1);
	     
	     if(Arrays.equals(ch, ch1)) {
	    	 System.out.println("this is an anagram ");
	     }else {
	    	 System.out.println("this is not an anagram");
	     }
	     
	     //number add ,re ,count 
	     int num=sc.nextInt();
	     int re=0;
	      int count=0;
	       int sum=0;
	       
	       while(num >0) {
	    	   re=re*10+num%10; //1234%10=4 40+123%10=43
	    	   sum=sum+num%10; //1234%10=4
	    	   num=num/10; //1234/10=123
	      count++;//1
	       }
	       System.out.println(re +" re number");
	       System.out.println(sum +" : is sum of all number");
	       System.out.println(count +" :is count of all number");
	   
	    
	    
	    
 	     //do while program
 	     int i=1;
 	        do {
 	        	if(i==5) {
                 i++;
 	        	continue;
 	        	}
 	        	System.out.println(i);
 	        	i++;
 	        }while(i<=10);
 	    
 	     //while loop program
 	      int i=1; 
 	      while(i<=10) {
 	    	  if(i==5) {
 	    		  i++;
 	    	  continue;
 	    	  }
 	    	  System.out.println(i);
 	    	  i++;
 	      } */
 	    
 	  /*
 	     String s=sc.nextLine();
 	     int totalcount=s.length();
 	     int totalcount_afterRemov=s.replace("i", "").length();
 	     
 	     int duplicateCount=totalcount-totalcount_afterRemov;
 	     
 	     int count=1;
 	     
 	     for(int i=0; i<s.length()-1; i++) {
 	    	 if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
 	    		 count++;
 	    	 }
 	     }
 	     System.out.println("numbe of words is : "+count);
 	     
 	     System.out.println("number is charachter is: "+duplicateCount);
 	    
 	     
 	  
 	     //rever string
 	     String str=sc.nextLine();
 	     String re="";
 	     int count=1;
 	     for(int i=str.length()-1; i>=0; i--) {
 	    	 re=re+str.charAt(i);
 	    	 if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' ')) {
 	    		 count++;
 	    	 }
 	     }
 	     System.out.println(re +":is rever");
 	     System.out.println(count);
 	   */ 
 	     
	/* 
	String username=args[0];
	String password=args[1];
	
	System.out.println(username);
	System.out.println(password);
	
  
 
   Vector data=new Vector();
 	      
 	     
 	  data.add("ram");
 	  data.add(12);
 	  data.add(12.3);
 	  data.add('c');
 	  
 	  Enumeration e=data.elements();
 	  ;
 	  while(e.hasMoreElements()) {
 		  System.out.println(e.nextElement());
 	  }
 	  */
 	  
 	   /*   
 	     String str="india is my country";
 	     int count; 
 	     
 	     int counts=0;
 	     int totalcount=str.length();
 	     int totalAfterRemo=str.replace("i", "").length();
 	     
 	    	 int totalc=totalcount-totalAfterRemo;
 	    	 System.out.println(totalc); 
 	     char ch[]=str.toCharArray();
 	     for(int i=0; i<ch.length; i++) {
 	    	 count=1;
 	    	 for(int j=i+1; j<ch.length; j++) {
 	    		 if(ch[i]==ch[j] && ch[i]!=' ') {
 	    			 count++;
 	    			 ch[j]='0';
 	    		 }
 	    	 }
 	    	 if(count>1 &&ch[i]!='0') {
 	    		 System.out.println("found duplicate element :"+ch[i]);
 	    	 }
 	     }
 	         
 	     
 	   	   //vowels andconsonant
 	     String str1="@india #is my country";
 	     int vowels =0;
 	     int conso=0;
 	     int space=0;
 	     int spichar=0;
 	     for(int i=0; i<str1.length(); i++) {
 	    	 
 	      	     char ch1=str1.charAt(i);

 	    	if(ch1=='a' ||ch1=='e' ||ch1=='i' ||ch1=='o' || ch1=='u') {
 	    
 	    		vowels++;
 	    	}else if(ch1==' ') {
 	    		space++;
 	    	}else if (ch1=='@' || ch1=='#' ||ch1=='$' ||ch1=='&' ||ch1=='*') {
 	    		spichar++;
 	    	}
 	    	
 	    	
 	    	else {

           conso++;
 	    	}
 	    	
 	     }System.out.println(vowels +" :is vowels");
 	    	System.out.println(conso +
 	    			": is consonant  ");
 	    	System.out.println(space +":is space ");
 	    	System.out.println(spichar +" :is special charater") ;
 	     
 	     */
 	     
 	     
 /*	     // find words in String
 	     String str1="india is my country in ";
 	     char ch[]=str1.toCharArray();
 	     int count=1;
 	     int con;
 	     
 	     int totalcount=str1.length();
 	     int totalcountafterremo=str1.replace("i", "").length();
 	     
 	     int countoftotal=totalcount-totalcountafterremo;
 	     System.out.println(countoftotal +":time i is found ");
 	     
 	     
 	     for(int i=0; i<str1.length()-1; i++) {
 	    	  con=1;
 	    	 
 	    	 if((str1.charAt(i)==' ') && (str1.charAt(i+1)!=' ')) {
 	    		 count++;
 	    	 }
 	    	 for(int j=i+1; j<str1.length(); j++) {
 	    		 if(ch[i]==ch[j] && ch[i]!=' ') {
 	    			 con++;
 	    			 ch[j]='0';
 	    		 }
 	    	 }if(con>1 && ch[i]!='0') {
 	    		 System.out.println(ch[i] );
 	    	 }
 	     }System.out.println(count+";count of word")
 	    ;
 	     
 	    
 	    */
 	     //find count of world
 	  /*   
 	     String str="india is my country";
 	     int count=1;
 	     char ch[]= str.toCharArray() ;
 	     int count1;
 	     
 	     int  totalcount=str.length()
 	    		 ;
 	     int totalcountafterremove=str.replace("i", "").length();
 	     
 	     int finalcount=totalcount-totalcountafterremove;
 	     System.out.println(finalcount +" time  i is repeted");
 	     
 	     for(int i=0; i<str.length(); i++) {
 	    	 count1=1;
 	    	 
 	    	 if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' ')) {
 	    		 count++;
 	    	 }
 	    	 for(int j=i+1; j<str.length(); j++ ) {
 	    		 if(ch[i]==ch[j] && ch[i]!=' ') {
 	    			 count1++;
 	    			 ch[j]='0';
 	    		 }
 	    	 }
 	    	 if(count1>1 && ch[i]!='0') {
 	    		 System.out.println("total duplicate charahter: "+ch[i]);
 	    	 }
 	     }
 	     System.out.println(count);
 	     
 	     //vowels and consonant
 	    String s=sc.next();
 	    int vowels=0;
 	    int conso=0;
 	    s=s.toLowerCase();
 	   
 	   
	     int  totalcount=s.length()
	    		 ;
	     int totalcountafterremove=s.replace("i", "").length();
	     
	     int finalcount=totalcount-totalcountafterremove;
	     System.out.println(finalcount +" time  i is repeted");
  	    
 	    for(int i=0; i<s.length(); i++) {
 	    	char ch1=s.charAt(i);
 	    	if(ch1=='a' || ch1=='e' ||ch1=='i' ||ch1=='u'  ||ch1=='o') {
 	    		vowels++;
 	    	}
 	    	else {
 	    		conso++;
 	    	}
 	    }
 	    System.out.println("vowels count: "+vowels);
 	    System.out.println("consonant count :"+conso);
 	     
 	     
 	  
 	    //final duplicate character
 	     String str="india is my country";
 	     
 	     
 	     char ch[]=str.toCharArray();
 	     int count;
 	     for(int i=0; i<str.length(); i++) {
 	    	 count=1;
 	    	 for(int j=i+1; j<str.length(); j++) {
 	    		 if(ch[i]==ch[j] && ch[i]!='0') {
 	    			 count++;
 	    			 ch[j]='0';
 	    		 }
 	    	 }if(count>1 &&ch[i]!=' ') {
 	    		 System.out.println(ch[i]+" : is duplicate character");
 	    		  
 	    	 }
 	    	 
 	     }*/
 	   /*  
 	     
 	     */
 	      String str="india is my country";
 	      int count=1;
 	      int count1;
 	      char ch[]=str.toCharArray();
 	      
 	      for(int i=0; i<str.length(); i++) {
 	    	 count1=1;
 	    	  if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' ')) {
 	    		  count++;
 	    	  }
 	    	  for(int j=i+1; j<str.length(); j++) {
 	    		 if(ch[i]==ch[j]  && ch[i]!=' ') {
 	    			 count1++;
 	    			 ch[j]='0';
 	    		 }
 	    	  }if(count1 >1 && ch[i]!='0') {
 	    		  System.out.println("duplicate charater  "+ch[i]);
 	    	  }
 	    	  
 	    	  
 	      }System.out.println(count +" total word count");
 	      
	}
	  	     
 	     }
  	      
 	    
	
	
