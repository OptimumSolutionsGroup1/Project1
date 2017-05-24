package grp1;

public class Bank {
	private int accountCounter = 0;
	BankAccount account[] = new BankAccount[100];
	
	public void createAcccount(int id, String name, int mobile, String email, double bal){
		account[accountCounter] = new BankAccount();
		account[accountCounter].setAccountNum(id);
		account[accountCounter].addName(name);
		account[accountCounter].addMobile(mobile);
		account[accountCounter].addEmail(email);
		account[accountCounter].setBalance(bal);
		account[accountCounter].setStatus("first");
		
		accountCounter++;
	}
	
	public void withdrawFrom(int accountNum, double amt) {	//logic to find acc in array for withdraw		
	    
		for (int i =0; i<accountCounter; i++) {
	        if (accountNum == account[i].getAccountNum()  ) {
	            account[i].withdraw(amt);
	            return;
	        }
	    }
	    
		System.out.println("Account number not found.");
		
	} // end of withdrawfrom class
	
	public void depositTo(int accountNum, double amt) { //logic to find acc in array for deposit
	    
		for (int i =0; i<accountCounter; i++) {
	    	if (accountNum == account[i].getAccountNum()  ) {
	    		account[i].deposit(amt);
	    		return;
	        }
	    }
	    
	    System.out.println("Account number not found.");
	    
	}// end of deposit class
	
	public void setAccountStatusTo(int accountNum, String status) {

		for (int i =0; i<accountCounter; i++) {
	    	if (accountNum == account[i].getAccountNum()  ) {
	    		account[i].setStatus(status);
	    		return;
	        }
	    }
	    
	    System.out.println("Account number not found.");

	}//end of set acc status
	
	public void getAccountInfo(int accountNum) {	//search array for account using acc id
		
	    for (int i =0; i<accountCounter; i++) {
	    	if (accountNum == account[i].getAccountNum()  ) {
	    		System.out.println(account[i].getAccountInfo());
	    		return;
	    	}
	    }
	    
	    System.out.println("Account number not found.");
	    
	}// end of get acc info class
	
	//only for testing
	public void show(){		//guanri show
		for (int i=0; i<accountCounter; i++){
			System.out.println(account[i].getCustomerDetails());
		}
	} //end of guanri show

	

}