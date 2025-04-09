package Day6;

import java.util.Scanner;

public class calculator {
	
public static void main(String[]args) {
	
Scanner sc= new Scanner(System.in);

System.out.println("simple calculator");

System.out.println("enter the first key");
int num1=sc.nextInt();
System.out.println("enter the second key");
int num2=sc.nextInt();

int key=sc.nextInt();


switch(key) {
case 1:{
	System.out.println("Addition is"+(num1+num2));
	break;
	
}
case 2:{
	System.out.println("Subtraction is"+(num1-num2));
	break;
	
	
}
case 3:{
	System.out.println("multiplication is"+(num1*num2));
	break;
}
case 4:{
	System.out.println("division is"+(num1/num2));
	break;
	
}
case 5:{
	System.out.println("modules is"+(num1%num2));
	break;
}
default:{
	System.out.println("invalid input");
	
}
}

}

}
