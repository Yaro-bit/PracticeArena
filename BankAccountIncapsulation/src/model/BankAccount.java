package model;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		if (amount > 0) {
			balance = amount + balance;
		}
		return balance;

	}

	public double withdraw(double amount) {
		if (balance > 0) {
			balance = balance - amount;
		}
		{
			System.out.println("Balance is not enough !");
		}
		return balance;

	}

	public void printAccountInfo() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + balance + " €");
	}

}
