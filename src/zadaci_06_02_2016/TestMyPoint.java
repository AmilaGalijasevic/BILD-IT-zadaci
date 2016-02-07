package zadaci_06_02_2016;

public class TestMyPoint {

	public static void main(String[] args) {
		// new objects
		myPoint m = new myPoint(0, 0);
		myPoint m1 = new myPoint(10, 30.5);

		// displays the distance between them
		System.out.println(m.distance(m1));
		
	}

}
