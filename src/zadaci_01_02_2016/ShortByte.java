package zadaci_01_02_2016;

import java.util.InputMismatchException;

public class ShortByte {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a short number:");
			int num = input.nextInt();
			// turns int to short
			short s = (short) num;
			// prints it in right format
			System.out.println(String.format("%016d", Short.parseShort(Integer.toBinaryString(s))));
			input.close();
			//exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
	}

}
