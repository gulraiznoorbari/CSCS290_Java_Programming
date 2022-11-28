package TaskTwo;

public class CheckingAccount extends BankAccount {
	private int fee = 15;
	public CheckingAccount(int accountNumber, double totalBalance) {
		super(accountNumber, totalBalance);
		this.fee = fee;
	}
	
	public int getFee() {
		return this.fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public double deductFee() {
		return super.getBalance() - fee;
	}
}
