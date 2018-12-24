package JavaFundamentals;

public  class AbstractClass {

	public  final void m1(int i)
	{
		System.out.println("integer");
	}
	public  final void m21(float f)
	{
		
	}
	public   void  mm()
	{}
	public static void main(String[] args) {
	AbstractClass obj=new AbstractClass();
	System.out.println(obj );
	System.out.println(obj.hashCode());
	}
}
