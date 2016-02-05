package zadaci_04_02_2016;

public class TestLocation {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			
		System.out.println("Enter the number of rows and columns in the array:");
		int r = input.nextInt();
		int c = input.nextInt();
		//new array with user number of rows and columns
		double [][] array = new double [r][c];

		System.out.println("Enter the array:");	
		//stores the numbers
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j]= input.nextDouble();
			}
		}
		//new object
		Location l = new Location();
		//gets location
		l = Location.locateLargest(array);
		//prints the location and max value
		System.out.println("The location of the largest element " +l.maxValue  + " is " + l.row + "," + l.column);
		input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong, try again");
			main(args);
		}
	}

}
