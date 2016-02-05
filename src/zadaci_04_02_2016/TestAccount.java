package zadaci_04_02_2016;

public class TestAccount {

	public static void main(String[] args) {
		// creates new object
		Account account = new Account();
		// sets it values
		account.setID(1122);
		account.setBalance(20000);
		account.setAnualInteresRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		// prints the balance and interest
		System.out.println("Account balance is: " + account.getBalance());
		System.out.println("Monthly interest is: " + account.getMonthlyInterest());
		System.out.println("Date Created:" + account.getDateCreated());

	}

}
