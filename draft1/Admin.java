package draft1;

public class Admin {

	public static void main(String[] args) {
		Bank ref = new Bank();
		
		ref.createAcccount("Melvin", 12345678, "melvin@gmail.com");
		ref.createAcccount("Siti", 84546465, "siti@gmail.com");
		
		ref.show();//only for testing
	}

}
