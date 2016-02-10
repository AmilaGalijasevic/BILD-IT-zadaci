package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListObject {

	public static void main(String[] args) {
		// nre array list of objects
		ArrayList<Object> list = new ArrayList<>();
		// array list of circle objects
		ArrayList<Circle> ce = new ArrayList<>();
		// creates new circle
		Circle c = new Circle();
		// adds that circle to list of circles
		ce.add(c);
		// adds the list of circles to the list of objects
		list.addAll(ce);
		// date list
		ArrayList<Date> d = new ArrayList<>();
		// new date
		Date date = new Date();
		// adds the date to the list
		d.add(date);
		// adds the list of dates to the list
		list.addAll(d);
		// new string
		String s = "Neki string";
		// adds the string to the list
		list.add(s);
		// since i don't have a loan class and don't know what was supposed to
		// be in it
		ArrayList<Triangle> triangle = new ArrayList<>();
		//i'm using triangle :)
		Triangle t = new Triangle();
		//adds it to the list
		triangle.add(t);
		list.addAll(triangle);

		// prints the objects in the list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
