package TaskTwo;

public class SavingAmount extends BankAccount{
	
	private float interestRate = (float) 2.5;
	public SavingAmount(int accountNumber, double totalBalance) {
		super(accountNumber, totalBalance);
		this.interestRate = interestRate;
	}
	
	public float getInterestRate() {
		return this.interestRate;
	}

	public void setFee(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public double addInterest() {
		return (super.getBalance() * interestRate);
	}
}
