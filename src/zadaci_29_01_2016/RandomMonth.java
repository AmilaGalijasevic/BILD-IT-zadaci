package zadaci_29_01_2016;

import java.util.ArrayList;

public class RandomMonth {

	public static void main(String[] args) {
		// generates random number up to 12
		int number = 1+(int) (Math.random() * 12);

		// array list for storing names of the month
		ArrayList<String> monthName = new ArrayList<>();
		// adds the months to list
		monthName.add("January");
		monthName.add("February");
		monthName.add("March");
		monthName.add("April");
		monthName.add("May");
		monthName.add("June");
		monthName.add("July");
		monthName.add("August");
		monthName.add("September");
		monthName.add("October");
		monthName.add("November");
		monthName.add("December");
		// prints random month
		System.out.println(number +  " => "+monthName.get(number-1));

	}

}
