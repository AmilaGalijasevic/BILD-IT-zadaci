package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListObject {

	public static void main(String[] args) {
		// nre array list of objects
		ArrayList<Object> list = new ArrayList<>();
		// creates new circle
		Circle c = new Circle();
		// adds the circle to the list of objects
		list.add(c);
		// new date
		Date date = new Date();
		// adds date to the list
		list.add(date);
		// new string
		String s = "Neki string";
		// adds the string to the list
		list.add(s);
		// since i don't have a loan class and don't know what was supposed to
		// be in it i'm using triangle :)
		Triangle t = new Triangle();
		// adds it to the list
		list.add(t);

		// prints the objects in the list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
