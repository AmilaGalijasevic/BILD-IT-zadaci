package zadaci_20_02_2016;

import java.util.InputMismatchException;

public class TestComplex {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// user inputs
			System.out.println("Enter the first complex number: ");
			double a = input.nextDouble();
			double a1 = input.nextDouble();
			System.out.println("Enter the second complex number: ");
			double b = input.nextDouble();
			double b1 = input.nextDouble();
			// new objects with inputed value
			Complex c = new Complex(a, a1);
			Complex c1 = new Complex(b, b1);
			// prints the operations
			System.out.println(c + " + " + c1 + " = " + c.add(c1));
			System.out.println(c + " - " + c1 + " = " + c.substract(c1));
			System.out.println(c + " * " + c1 + " = " + c.multyply(c1));
			System.out.println(c + " / " + c1 + " = " + c.divide(c1));
			System.out.println("|" + c + "|" + " = " + c.abs());

			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input, try again");
			main(args);
		}
	}

}
