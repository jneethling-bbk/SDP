package week1.generics_and_reflection;

public class BankAccount {
	private float balance;
	
	public void deposit(float amount) {
		this.balance += amount;
	}
	
	public float showBalance() {
		return balance;
	}
	BankAccount() {
		balance = 100;
	}
}
