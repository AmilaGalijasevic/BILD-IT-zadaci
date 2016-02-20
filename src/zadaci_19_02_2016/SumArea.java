package zadaci_19_02_2016;

public class SumArea {
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		// sums the areas of the objects
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		// returns sum
		return sum;
	}

	public static void main(String[] args) {
		// new objects
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(4);
		Rectangle r1 = new Rectangle(2, 5);
		Rectangle r2 = new Rectangle(7.3, 2);
		// stores them in array
		GeometricObject[] a = { c1, c2, r1, r2 };
		// prints the sum
		System.out.println("Sum of objects area is: " + sumArea(a));

	}

}
