package JavaFundamentals;

public class ClassB extends ClassA{

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
	}
		public static void main(String[] args) {
			ClassB obj=new ClassB();
			obj.add();
			obj.mult();
			
		}

	
}
