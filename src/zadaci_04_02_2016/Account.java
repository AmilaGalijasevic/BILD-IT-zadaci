package zadaci_04_02_2016;

import java.util.Date;

public class Account {

	// data fields
	private int ID;
	private double balance;
	private double anualInteresRate;
	private Date dateCreated;

	public Account() {
		ID = 0;
		balance = 0;
		anualInteresRate = 0;
	}

	public Account(int newID, double newBalance) {
		ID = newID;
		balance = newBalance;

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {

		this.balance = newBalance;
	}

	public double getAnualInteresRate() {
		return anualInteresRate;
	}

	// calculates annual interest rate
	public void setAnualInteresRate(double anualInteresRate) {
		this.anualInteresRate = anualInteresRate / 100;
	}

	// returns date
	public Date getDateCreated() {
		Date date = new Date();
		return date;

	}

	// calculates monthly interest rate
	public double getMonthlyInterestRate() {

		return (getAnualInteresRate() / 12);
	}

	// Calculates monthly interest
	public double getMonthlyInterest() {

		return getBalance() * getMonthlyInterestRate();
	}

	// method for calculating withdrawal
	public double withdraw(double amount) {
		this.balance -= amount;
		System.out.println("After withdrawing " + amount + " balance in account " + ID + " is: " + this.balance);
		return this.balance;
	}

	// calculates deposit
	public double deposit(double amount) {
		this.balance += amount;

		System.out.println("After depositing " + amount + " balance in account " + ID + " is: " + this.balance);

		return this.balance;

	}

}
