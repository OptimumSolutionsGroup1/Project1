package grp1;

public class BankAccount implements Account, CustomerDetails{
	private int accountNumber;
	private String name;
	private int mobile;
	private String email;
/*	private double deposit;			//unused
	private double withdraw;*/
	private double balance;
	String status;					//account status whether its lock or locked
	
	
	public String getStatus() {		//get status
		return status;
	}

	public void setStatus(String status) {//set status
		this.status = status;
	}

	public void setBalance(double balance) { //set bal
		this.balance = balance;
	}//end of set bal

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

/*	@Override 										//unused
	public double deposit(double deposit) {
		this.deposit = deposit;
		return balance + deposit;
		
	}

	@Override
	public double withdraw(double withdraw) {
		this.withdraw = withdraw;
		return balance - withdraw;
	}*/

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
	
	
	public int getAccountNum(){
	 	return accountNumber;
	}
	 
	public void setAccountNum(int accountNumber){
		 	this.accountNumber = accountNumber;
	}
	
	public void withdraw(double amount){	//withdraw method
        if (amount<=0){
             System.out.println("Amount should be more than 0..");
         }
        else
        {
            if (balance < amount) {
                System.out.println("Insufficient balance");

            } else {
                balance = balance - amount;
                System.out.println("Amount withdrawn successfully");
               //
                //
               //space for transaction record
               // 
                //
                
            }
        }
    }//end of withdraw method
	
	public void deposit(double amount){	//deposit
		if (amount<=0) {
			System.out.println("Amount should be more than 0..");
	        } else {
	        	balance = balance + amount;
	        	System.out.println(amount + " deposit successfully");
	            //
                //
               //space for transaction record
               // 
                //
	        }
	}//end of deposit
	
	public String getAccountInfo(){
        return "Account number: " + accountNumber + "\nCustomer Name: " + name + "\nBalance:" + balance +"\n";
    }
}
