package day5;

import java.util.Scanner;

public class condition1 {
	public static void main(String[]args){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark= sc.nextInt();
	System.out.println("your mark is"+mark);
	
	if(mark>=35&& mark<=105) {
	 System.out.println(" your are pass");
	if(mark>=90) {
		System.out.println("grade:A");
	}
	else if(mark>=80) {
		System.out.println("grade:B");
		
	}
	else if(mark>=70) {
		System.out.println("grade:c");
	}
	else {
		System.out.println("grade:D");
	}
	}
		
	else if(mark<=35) {
		System.out.println("your are fail");
	}
	
	else {
		System.out.println("mark are invaild");
	}
	}

}
