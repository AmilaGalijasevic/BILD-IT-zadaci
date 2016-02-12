package zadaci_12_02_2016;

import java.lang.IllegalArgumentException;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// Default constructor
	public Loan() throws IllegalArgumentException {
		this(2.5, 1, 1000);
	}

	// constructor with specified interest rate,number of years, and loan amount

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		//illegal argument exception
		IllegalArgumentException e = new IllegalArgumentException();
		if (annualInterestRate < 0 || numberOfYears < 0 || loanAmount < 0) {
			throw e;
		}
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	//annualInterestRate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//sets a new annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//returns numberOfYears 
	public int getNumberOfYears() {
		return numberOfYears;
	}

	//set a new numberOfYears 
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	
	public double getLoanAmount() {
		return loanAmount;
	}

	//set a new loanAmount 
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {

		this.loanAmount = loanAmount;
	}

	//calculates payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	//calculates total payment 
	public double getTotalPayment() {

		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
