package Aug23;

public class Bank_Test {
	
	
	public static void main(String[] args) {
		
		Bank_ABC a = new Bank_ABC();
		Bank_EFG e = new Bank_EFG();
		Bank_GHI g = new Bank_GHI();
		
		System.out.println("Bank ABC Interest rate : "+a.getInterestRate());
		System.out.println("Bank ABC Interest rate : "+e.getInterestRate());
		System.out.println("Bank ABC Interest rate : "+g.getInterestRate());
	}

}
