package day18;

public class Constructor {
	String name;
	long phnumber;
	
Constructor () {
	
	
}
Constructor (String name){
	this.name= name;
	
}
Constructor(long phnumber){
	this.phnumber=phnumber;
}
	

	
	
public static void main(String[] args) {
	Constructor c=new Constructor("vijay");
	System.out.println(c.name);
	Constructor c1=new Constructor(9875436998l);
	System.out.println(c1.phnumber);
	
}

}
