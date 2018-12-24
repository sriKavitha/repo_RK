package JavaFundamentals;

public abstract class ClassA implements A{

	@Override
	public void add() {
		int c=a+b;
		System.out.println(c);
	}

	//@Override
	/*public void mult() {
		int c=a*b;
		System.out.println(c);

	}*/
public static void main(String[] args) {
	//ClassA obj=new ClassA();
	//obj.add();
	//obj.mult();
}
}
