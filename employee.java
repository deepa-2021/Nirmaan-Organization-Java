package day9;

public class employee {
String name;
long phonenumber;
double salary;

void display() {
	System.out.println("employee name:"+name);
	System.out.println("employee phonenumber:"+phonenumber);
	System.out.println("employee salary:"+salary);
}

public static void main(String[]args) { 
employee emp=new employee();
 
emp.name="deepa";
emp.phonenumber=9234567890l;
emp.salary=30000;
emp.display();
System.out.println("    ");

employee emp2= new employee();

emp.name="hema";
emp.phonenumber=9230987890l;
emp.salary=3000;
emp.display();
System.out.println("    ");

employee emp3= new employee();
emp.name="keerthana";
emp.phonenumber=9234515489l;
emp.salary=20000;
emp.display();

}






	
			
	
	
}


