package zadaci_15_02_2016;

public class NumFException {
	public static void bin2Dec(String binaryString) {
		double num = 0;
		// converts a binary string into a decimal number
		num = Double.parseDouble(binaryString);
		// prints it
		System.out.println(num);
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a number");
			String binaryString = input.next();
			// calls the method for converting number
			bin2Dec(binaryString);
			// catches the number format exception
		} catch (NumberFormatException e) {
			System.out.println("Wrong number format");
			main(args);
		} finally {
			input.close();
		}
	}

}
