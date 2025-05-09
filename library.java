package day14;

public class library {
	
int id;
String bookname;
String author;
double price;


public static void main(String[]args) {
	
library li=new library();

li.id=1124;
li.bookname="history";
li.author="deepa";
li.price=1200;


library li1=new library();
li1.id=1134;
li1.bookname="english";
li1.author="hema";
li1.price=1300;

library li2=new library();
li2.id=1234;
li2.bookname="knowledge";
li2.author="keerthana";
li2.price=1345;

library li3=new library();
li3.id=2345;
li3.bookname="tamil";
li3.author="jeevitha";
li3.price=2345;



System.out.println(li.bookname);
System.out.println(li.id);
System.out.println(li.author);
System.out.println(li.price);

System.out.println(li1.bookname);
System.out.println(li1.id);
System.out.println(li1.author);
System.out.println(li1.price);

System.out.println(li2.bookname);
System.out.println(li2.id);
System.out.println(li2.author);
System.out.println(li2.price);

System.out.println(li3.bookname);
System.out.println(li3.id);
System.out.println(li3.author);
System.out.println(li3.price);



	


}
}
