package draft1;

public class BankAccount implements Account, CustomerDetails{
	private String name;
	private int mobile;
	private String email;
	private double deposit;
	private double withdraw;
	private double balance;
	String status;
	
	
	@Override
	public void addName(String name) {
		this.name = name;
		
	}

	@Override
	public void addMobile(int mobile) {
		this.mobile = mobile;
		
	}

	@Override
	public void addEmail(String email) {
		this.email = email;
		
	}

	@Override
	public double deposit(double deposit) {
		this.deposit = deposit;
		return balance + deposit;
		
	}

	@Override
	public double withdraw(double withdraw) {
		this.withdraw = withdraw;
		return balance - withdraw;
	}

	@Override
	public void checkBalance() {
		System.out.println(balance);
		
	}

	@Override
	public boolean accountStatus(String status) {
		this.status = status;
		return true;
	}

	@Override
	public String getCustomerDetails() {
		
		return name + " " + mobile + " " + email;
	}
	
	

}
