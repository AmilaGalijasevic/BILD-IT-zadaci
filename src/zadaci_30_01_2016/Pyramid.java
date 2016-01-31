package zadaci_30_01_2016;

public class Pyramid {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			// for printing spaces
			for (int j = 1; j <= num - i; j++) {
				System.out.print("   ");
			} // prints left side of the pyramid
			for (int k = i; k >= 1; k--) {
				// if k is bigger prints spaces after the number
				if (k > num) {
					System.out.print("  ");
					// else prints numbers
				} else {
					System.out.print(k + "  ");
				}
			}
			// prints right side of the pyramid
			for (int k = 2; k <= i; k++) {
				// prints spaces
				if (k > num) {
					System.out.print("  ");
					// prints numbers
				} else {
					System.out.print(k + "  ");
				}
			}
			// prints next line
			System.out.println();
		}
		input.close();
	}

}
