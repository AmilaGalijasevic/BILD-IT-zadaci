package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class LeapYear {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter first and last year for which you would like to see leap years:  ");
			int first = input.nextInt();
			int last = input.nextInt();
			int count = 0;
			// calculates years from first inputed to the last
			for (int i = first; i <= last; i++) {
				// year is a leap year if it is divided by 4 and 100, but not
				// 400
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
					// displays the years
					System.out.print(i + " ");
					// counts them
					count++;
					// if it count 10 of them prints in next line
					if (count % 10 == 0) {
						System.out.println();
					}
				}
			}
			// catches exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");

		}
		input.close();
	}

}
