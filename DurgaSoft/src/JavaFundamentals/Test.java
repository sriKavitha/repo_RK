package JavaFundamentals;
class Parent {
	public void workhard()
	{
		System.out.println("wakeup early, Go to college...");
	}
	public void care()
	{
		System.out.println("Atmost care...");
	}
}
class Child extends Parent
{
	public void workhard()
	{
		System.out.println("Sleep Late, Go to college...");
	}
	public void love()
	{
		System.out.println("I am in Love...");
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.care();
		p.workhard();
		Child c=new Child();
		c.workhard();
		c.love();
		c.care();
		Parent p1= new Child();
		p1.workhard();
		p1.care();
	}}
