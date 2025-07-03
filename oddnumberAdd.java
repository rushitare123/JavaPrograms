package allInOne;

import java.util.Scanner;

public class oddnumberAdd {
public static void main(String[] args) {
	/*	 int sum=0;
		int num = 1234;
		int even=0;
		int oddcount=0;
		int rev=0;
		
		while(num >0) {
		rev= rev+num%10;//1234/10=4
		 
			if(rev%2==0) {
				even++;
			}
			else {
				oddcount++;
			}
		num =num/10;
		}
		System.out.println(oddcount+ "count of odd number" +" "+sum);
		System.out.println(even +" even count");
		
		*/
	
	//find area of circal 
	int r=4;
	float pai= 3.14f;
	
	double area =pai*r*r;
	System.out.println("area of circal is :"+ area);
	
	System.out.println("enter any number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int squear =num *num;
	System.out.println("squear of number is: "+squear);
	
	
	int vowels =0;
int consonant=0;
String name= "india is my country";
String [] w=name.split("");
for(int i=0; i<name.length(); i++) {
	char ch =name.charAt(i);
	 
	if(ch=='a' || ch=='i'  ||ch=='o' ||ch=='u' || ch=='e' ) {
		vowels++;
	}
	else {
		consonant++;
	}
	for(String s: w) {
		System.out.println(w);
	}
	
}
 System.out.println(vowels +" vowels ");
	System.out.println(consonant +" consonant ");
	}





}
