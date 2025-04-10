package day7;

import java.util.Scanner;

public class Task {
	
public static void main(String[]args) {
	
Scanner sc= new Scanner(System.in);

System.out.println("enter the iteration");

int iteration=sc.nextInt(); 


for( int i=1;i<=iteration;i++) { 
	if(i%3==0) {
		System.out.println(i);
	}

}
for(int i=1;i<=iteration;i++) {
	if(i%4==0)
	{
		System.out.println("Deepa");
	}
	else {
		System.out.println(i);
	}
}

int count=0;
for(int i=1;i<=iteration;i++) 
{
	if(i%3==0) {
		count++;
	}
}

		System.out.println("the count is:"+count);
		
		
	}
}
	






