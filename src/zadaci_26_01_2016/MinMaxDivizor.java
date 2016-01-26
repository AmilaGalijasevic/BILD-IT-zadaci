package zadaci_26_01_2016;

import java.util.InputMismatchException;

public class MinMaxDivizor {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			
		System.out.println("Enter two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int min = 1;
		int max = 1;
		//if input is zero
		while(a==0 || b==0){
			System.out.println("Enter number bigger than 0");
			if(a==0){
				a = input.nextInt();
			}else{
				b = input.nextInt();
			}
		}
			// searches for max divisor
			for (int i = 1; i <= b; i++) {
				if (b % i == 0 && a % i == 0) {
					max = i;
				}
			}
			//searches for min divisor
			for (int i = b; i >= 2; i--) {
				if (b % i == 0 && a % i == 0) {
					min = i;
				}

			}
			
		//prints them
		System.out.println("Max divizor is: " + max + "\nMin divizor is: " + min);
		input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again: ");
			main(args);
		}
	}
}
