package JavaFundamentals;

public class ConstructorDemo {
int no;
String name;
ConstructorDemo()
{
	System.out.println("This is default constructor...");
}
ConstructorDemo(int no, String stri)
{ 
	this();
	this.no=no;
	this.name=stri;
}

public static void main(String[] args) {
	ConstructorDemo obj=new ConstructorDemo();
	System.out.println(obj.no);
	System.out.println(obj.name);
	ConstructorDemo obj1=new ConstructorDemo(1,"kavitha");
	System.out.println(obj1.no);
	System.out.println(obj1.name);
	
}
}
