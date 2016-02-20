package zadaci_18_02_2016;

public class ComparableGeoObject {

	public static void main(String[] args) {
		// new circle objects
		GeometricObject c = new Circle2(3);
		GeometricObject cc = new Circle2(5.5);
		// finds the max
		GeometricObject max1 = GeometricObject.max(c, cc);
		// prints it
		System.out.println("Max circle: "+max1);
		// new rectangle objects
		GeometricObject r = new Rectangle(2, 4);
		GeometricObject rr = new Rectangle(1, 6);
		GeometricObject max2 = GeometricObject.max(r, rr);
		// prints the max object
		System.out.println("Max rectangle: "+max2);
	}

}
