package zadaci_10_02_2016;

import java.util.InputMismatchException;

public class TestTriangle {

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Enter 3 sides of a triangle:");
			// user inputs
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			// triangle object
			Triangle t = new Triangle(a, b, c);
			System.out.println("Enter a color of the triangle:");
			String color = input.next();
			// sets color
			t.setColor(color);
			System.out.println("Enter true or false if the triangle is filled");
			String boo = input.next();
			// sets boolean
			if (boo.equals("true")) {
				boolean bool = true;
				t.setFilled(bool);
			}
			if (boo.equals("false")) {
				boolean bool = false;
				t.setFilled(bool);
			}
			// prints the properties
			System.out.println(t.toString() + " =>> Area: " + t.getArea() + ", Perimetar: " + t.getPerimetar()
					+ ", Color: " + t.getColor() + ", Filled: " + t.isFilled());
			input.close();

		} catch (InputMismatchException ey) {
			System.out.println("wrong input");
			main(args);
		}
	}

}
