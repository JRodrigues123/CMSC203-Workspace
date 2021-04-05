/**
 * This is the checking account for the Lab 6
 * @author justinrodrigues
 *
 */
public class CheckingAccount extends BankAccount{
	
	/*
	 * This is the static constant fee
	 */
	static final double FEE = 0.15;
	
	/**
	 * This is a constructor for the checkings account
	 * @param accountName
	 * @param inAmount
	 */
	public CheckingAccount(String accountName, int inAmount) {
		
		//Takes parameters from the BankAccount
		super(accountName, inAmount);
		
		//The mod account name
		String modAccount = accountName + "-10";
		
		//USes the mututator method
		this.setAccountNumber(modAccount);
		
		
	}
	
	/**
	 * This is a method to show whether the money you withdrawn
	 * is more or less than the money you have in your account
	 */
	@Override
	public boolean withdraw(double amount) {
		
		//This is to hold the amount of money withdrawn plus the fee
		double withdraw = amount + FEE;
		
		//This returns the variable within a method
		return super.withdraw(withdraw);
	}
}
