package Encapsulations;

public class BankAccount {

	private int accountNumber;
	private String holderName;
	private double balance;

	void setaccountNumber(int AccountNumber) {
		accountNumber = AccountNumber;

	}

	public int getaccountNumber() {
		return accountNumber;
	}

	void setholderName(String HolderName) {
		holderName = HolderName;
	}
	public String getholderName() {
		return holderName;
		
	}
	void setbalance( double Balance) {
		balance = Balance;
	}

	public double getbalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Successufully");

		} else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw (double amount) {
		if(amount >0 && amount <= balance) {
			balance = balance  - amount;
			System.out.println("withdraw successufully");
			
		}
		else {
			System.out.println("insufficiant balance");
		}
	}

}
