package zadaci_04_02_2016;

public class Location {
	// data fields
	public int row;
	public int column;
	public double maxValue;

	// constructors
	public Location() {

	}

	public Location(int row, int column, double maxValue) {
		super();
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public static Location locateLargest(double[][] a) {

		int rowIndex = 0;
		int columnIndex = 0;
		double max = 0;
		// searches for max element
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];

				}
			}
		}
		// searches for position
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == max) {
					rowIndex = i;
					columnIndex = j;
				}
			}
		}
		// gives the values
		Location l = new Location();
		l.maxValue = max;
		l.row = rowIndex;
		l.column = columnIndex;
		// returns location
		return l;

	}
}
