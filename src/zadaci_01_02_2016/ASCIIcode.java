package zadaci_01_02_2016;

import java.util.InputMismatchException;

public class ASCIIcode {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a ASCII code (number between 0 & 127)");
			int num = input.nextInt();
			// while inputed number isn't correct
			while (num > 127 || num < 0) {
				System.out.println("Wrong input, try again");
				num = input.nextInt();
			}
			// if the output is bigger than 1, char prints the right value
			if (num == 1) {
				System.out.println("NUL");
			} else if (num == 2) {
				System.out.println("SOH");
			} else if (num == 3) {
				System.out.println("STX");
			} else if (num == 4) {
				System.out.println("ETX");
			} else if (num == 5) {
				System.out.println("EOT");
			} else if (num == 6) {
				System.out.println("ACK");
			} else if (num == 7) {
				System.out.println("BEL");
			} else if (num == 8) {
				System.out.println("BS");
			} else if (num == 9) {
				System.out.println("TAB");
			} else if (num == 10) {
				System.out.println("LF");
			} else if (num == 11) {
				System.out.println("VT");
			} else if (num == 12) {
				System.out.println("FF");
			} else if (num == 13) {
				System.out.println("CR");
			} else if (num == 14) {
				System.out.println("SO");
			} else if (num == 15) {
				System.out.println("SI");
			} else if (num == 16) {
				System.out.println("DLE");
			} else if (num == 17) {
				System.out.println("DC1");
			} else if (num == 18) {
				System.out.println("DC2");
			} else if (num == 19) {
				System.out.println("DC3");
			} else if (num == 20) {
				System.out.println("DC4");
			} else if (num == 21) {
				System.out.println("NAK");
			} else if (num == 22) {
				System.out.println("SYN");
			} else if (num == 23) {
				System.out.println("ETB");
			} else if (num == 24) {
				System.out.println("CAN");
			} else if (num == 25) {
				System.out.println("EM");
			} else if (num == 26) {
				System.out.println("SUB");
			} else if (num == 27) {
				System.out.println("ESC");
			} else if (num == 28) {
				System.out.println("FS");
			} else if (num == 29) {
				System.out.println("GS");
			} else if (num == 30) {
				System.out.println("RS");
			} else if (num == 31) {
				System.out.println("US");
			} else if (num == 32) {
				System.out.println("SPACE");
			} else if (num == 127) {
				System.out.println("DEL");
				// prints all other corresponding values
			} else {
				System.out.println((char) num);
			}
			input.close();
			// input exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
	}
}
