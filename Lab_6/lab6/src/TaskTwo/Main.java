package TaskTwo;

public class Main {

	public static void main(String[] args) {
		int accountNumber = 12345;
		double totalBalance = 500000;
		CheckingAccount bankAccount = new CheckingAccount(accountNumber, totalBalance);
		System.out.print("Balance after Fee Deduction: " + bankAccount.deductFee());
		SavingAmount saving = new SavingAmount(accountNumber, totalBalance);
		System.out.println("\nAmount after Interest Addition: " + saving.addInterest());
	}

}
