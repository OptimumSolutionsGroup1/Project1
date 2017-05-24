package draft1;

public interface Account {
	
	double deposit(double deposit);
	
	double withdraw(double withdraw);
	
	void checkBalance();
	
	boolean accountStatus(String status);

}
