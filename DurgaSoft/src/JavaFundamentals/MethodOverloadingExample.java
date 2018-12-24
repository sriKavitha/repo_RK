package JavaFundamentals;

public class MethodOverloadingExample {
	
	/*public void m1(int i)
	{
		System.out.println("I am in int meth..." +i);
	}
	public void m1(float f)
	{
		System.out.println("I am in float meth..." +f);		
	}
	public void m1(String s)
	{
		System.out.println("I am in String meth..." +s);		
	}
	*/
	public void m1(Integer i)
	{
		System.out.println("I am in Integer meth..." +i);		
	}
	public void m1(Number n)
	{
		System.out.println("I am in Number meth..." +n);		
	}
	public void m1(Object o)
	{
		System.out.println("I am in Object meth..." +o);		
	}
	public static void main(String[] args) {
		MethodOverloadingExample obj=new MethodOverloadingExample();
		obj.m1(100);
		obj.m1(12.324f);
		obj.m1("Kavitha");
		obj.m1(12);
		obj.m1(15.36f);
		obj.m1("KavithaS");
	}
}
