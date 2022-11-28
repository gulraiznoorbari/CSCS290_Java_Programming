package TaskTwo;

public class BankAccount {
	private int accountNumber;
	private double totalBalance;
	
	public BankAccount(int accountNumber, double totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}
	
	public void setBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public double getBalance() {
		return this.totalBalance;
	}
}
