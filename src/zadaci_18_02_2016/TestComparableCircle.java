package zadaci_18_02_2016;

public class TestComparableCircle {

	public static void main(String[] args) {
		// new circle objects
		Circle c = new ComparableCircle();
		//sets the radius
		c.setRadius(2);
		Circle cc = new ComparableCircle();
		cc.setRadius(3);
		// finds the max
		ComparableCircle max = ComparableCircle.max((ComparableCircle) c, (ComparableCircle) cc);
		// prints it
		System.out.println("Max circle has area of: "+max);
	}

}
