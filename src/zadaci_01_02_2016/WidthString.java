package zadaci_01_02_2016;

import java.text.DecimalFormat;
import java.util.Arrays;

public class WidthString {
	public static String format(int number, int width) {
		// new array for zeros
		char[] zeros = new char[width];
		// fills the array with 0
		Arrays.fill(zeros, '0');
		// formats number as string
		DecimalFormat df = new DecimalFormat(String.valueOf(zeros));
		// returns formated number
		return df.format(number);

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter number:");
			int num = input.nextInt();
			System.out.println("Enter width:");
			int w = input.nextInt();
			// calls method with inputed arguments
			System.out.println(format(num, w));
			input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong, try again:");
			main(args);
		}
	}

}
