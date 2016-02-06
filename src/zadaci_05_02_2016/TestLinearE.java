package zadaci_05_02_2016;

public class TestLinearE {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter a, b, c, d, e, and f: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();
			double e = input.nextDouble();
			double f = input.nextDouble();
			// new object
			LinearEquation l = new LinearEquation(a, b, c, d, e, f);
			// if the method returns true displays the solution
			if (l.isSolvable()) {
				System.out.println("X: " + l.getX());
				System.out.println("Y: " + l.getY());
				// if method returns false there is no solution
			} else {
				System.out.println("The equation has no solution.");
			}
			input.close();
		} catch (Exception e) {

			System.out.println("Something went wrong");

		}
	}
}
