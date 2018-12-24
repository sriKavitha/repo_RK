package JavaFundamentals;

public interface Rbi {
	
void withdrawl();

public static void main(String[] args) {
	Rbi i;
	i=new Icici();
	i.withdrawl();
	i=new Hdfc();
	i.withdrawl();
	
}

}
