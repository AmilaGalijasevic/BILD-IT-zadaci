package zadaci_05_02_2016;

public class TestQE {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter 3 coefficients, a, b, and c: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			// object
			QuadraticEquation qe = new QuadraticEquation(a, b, c);
			// if the calculated discriminant is positive number
			if (qe.getDiscriminant() > 0) {
				System.out.println(qe.getRoot1());
				System.out.println(qe.getRoot2());
				// if the disc. is zero returns first root
			} else if (qe.getDiscriminant() == 0) {
				System.out.println(qe.getRoot1());
				// if there are no roots
			} else {
				System.out.println("The equation has no roots");
			}
			input.close();
		} catch (Exception ey) {

			System.out.println("Something went wrong");
		}
	}

}
