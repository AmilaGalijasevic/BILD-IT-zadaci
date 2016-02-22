package zadaci_22_02_2016;

public class GDCRecursion {
	public static int gdc(int m, int n) {
		// caclulates gdc by recursion
		if (m % n == 0) {
			return n;
		} else {
			return gdc(n, m % n);
		}

	}

	public static void main(String[] args) {

		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// user input
			System.out.println("Enter two integers");
			int a = input.nextInt();
			int b = input.nextInt();
			// prints it
			System.out.println("GDC is: " + gdc(a, b));

		} catch (Exception e) {
			System.out.println("Wrong input, try again: ");
			main(args);
		}
	}

}
