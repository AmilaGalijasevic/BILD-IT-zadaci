package zadaci_20_02_2016;

public class RationaCalculator {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// The result of the operation
			double result = 0;
			System.out.println("Enter the operation: ");
			String calc1 = input.next();
			String oper = input.next();
			String calc2 = input.next();
			// rational objects
			Rational r = new Rational();
			Rational r2 = new Rational();
			// calculator for rationals
			if (calc1.contains("/") || calc2.contains("/")) {
				// sets numerators and denominators by splitting the string
				r.setNumerator(Long.parseLong(calc1.split("/")[0]));
				r.setDenominator(Long.parseLong(calc1.split("/")[1]));
				r2.setNumerator(Long.parseLong(calc2.split("/")[0]));
				r2.setDenominator(Long.parseLong(calc2.split("/")[1]));
				// Determine the operator
				switch (oper) {
				// calculates depending on the operator
				case "+":
					result = r.doubleValue() + r2.doubleValue();
					break;
				case "-":
					result = r.doubleValue() - r2.doubleValue();
					break;
				case "*":
					result = r.doubleValue() * r2.doubleValue();
					break;
				case "/":
					result = r.doubleValue() / r2.doubleValue();
				}
				// displays the result
				System.out.println(r.toString() + " " + oper + " " + r2.toString() + " = " + result);
				// for other numbers
			} else {
				r.setNumerator(Long.parseLong(calc1));
				r.setDenominator(Long.parseLong(calc2));
				switch (oper) {
				case "+":
					result = r.getNumerator() + r.getDenominator();
					break;
				case "-":
					result = r.getNumerator() - r.getDenominator();
					break;
				case "*":
					result = r.getNumerator() * r.getDenominator();
					break;
				case "/":
					result = r.doubleValue();
				}
				System.out.println(r.getNumerator() + " " + oper + " " + r.getDenominator() + " = " + result);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong...");
			main(args);
		} finally {
			input.close();
		}
	}
}
