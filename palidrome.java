package day16; 

public class palidrome {
public static void main(String[] args) {
	String name=" madam";
	String rss=name.trim();
	String rs="";
	
	
	for(int i=4;i>=0;i--)
	{
		rs+=rss.charAt(i);
	}
	
	if(rs.equals(rss)) {
		System.out.println("it is palidrome");
		
	}
	else {
		System.out.println("it is not palidrome");
	}
	
}

}
