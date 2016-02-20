package zadaci_19_02_2016;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		// octagon objects
		Octagon o1 = new Octagon(8);
		Octagon o2 = (Octagon) o1.clone();
		Octagon o3 = new Octagon(9);
		// prints them
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());
		// compares the first and second object
		System.out.println(o1.compareTo(o2));
		// comoares the first and third object
		System.out.println(o1.compareTo(o3));

	}

}
