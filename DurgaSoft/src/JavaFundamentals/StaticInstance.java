package JavaFundamentals;

public class StaticInstance {
	int a=100;
	static float roi=8.5f;

	public void m1()
	{
		System.out.println("m1:::");
		System.out.println(a);
		System.out.println(roi);
		m2();
	}

	public static void m2()
	{
		System.out.println("m2:::");
		StaticInstance obj=new StaticInstance();
		System.out.println(obj.a);
		//obj.m1();
	}
	public static void main(String[] args) {
		StaticInstance obj= new StaticInstance();
		System.out.println("Main method");
		System.out.println(obj.a);
		System.out.println(roi);
		//System.out.println();
		obj.m1();
		m2();
	}
}
