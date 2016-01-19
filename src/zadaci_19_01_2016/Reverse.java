package zadaci_19_01_2016;

public class Reverse {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// array for storing numbers
		int[] numbers = new int[10];
		try {
			System.out.println("Enter 10 numbers");
			// stores the entered numbers to array
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();
			}
			System.out.println("Backwards:");
			// displays the reversed array
			for (int i = numbers.length - 1; i >= 0; i--) {
				System.out.print(numbers[i] + " ");
			}
			// catches exceptions
		} catch (Exception ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
