package JavaFundamentals;

public class ClassC implements A, B{

	@Override
	public void sub() {
		int i=c-d;	
		System.out.println(i);
	}

	@Override
	public void div() {
		int i=c/d;
		System.out.println(i);
	}

	@Override
	public void add() {
		int j=a+b;
		System.out.println(j);
	}

	@Override
	public void mult() {
		int j=a*b;
		System.out.println(j);
	}
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.add();
		obj.mult();
		obj.sub();
		obj.div();
	}
}
