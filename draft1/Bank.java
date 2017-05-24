package draft1;

public class Bank {
	private int accountCounter = 0;
	BankAccount account[] = new BankAccount[100];
	
	public void createAcccount(String name, int mobile, String email){
		account[accountCounter] = new BankAccount();
		account[accountCounter].addName(name);
		account[accountCounter].addMobile(mobile);
		account[accountCounter].addEmail(email);
		
		accountCounter++;
	}
	
	//only for testing
	public void show(){
		for (int i=0; i<accountCounter; i++){
			System.out.println(account[i].getCustomerDetails());
		}
	}
	

}
