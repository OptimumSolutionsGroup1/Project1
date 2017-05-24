package grp1;

public class Admin {

	public static void main(String[] args) {
		Bank ref = new Bank();
		
		//create account with input: accountID, name, mobile, email, balance
		//1st time create account the status will be set to value "first"
		ref.createAcccount(1,"Melvin", 91274737, "melvin@gmail.com",1000.00);
		ref.createAcccount(2,"Siti", 84546465, "siti@gmail.com",500.00);
		
		//ref.show();//only for testing
		
		
		ref.withdrawFrom(1, 500.00); // withdraw from account id 1, amt is 500.00
		ref.depositTo(1, 10);// deposit to acount id 1, 500.00
		
		ref.getAccountInfo(1); // get individual account by account id
		
		ref.setAccountStatusTo(1,"lock");// set account wif account id 1 to lock,
	}

}