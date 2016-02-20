package zadaci_18_02_2016;

public class TestColorable {

	public static void main(String[] args) {
		//square objects
		Square s1 = new Square(3);
		Square s2 = new Square(6);
		Square s3 = new Square(1);
		Square s4 = new Square(7);
		Square s5 = new Square(4);
		//array of square objects
		Square[] obj = new Square[5];
		obj[0] = s1;
		obj[1] = s2;
		obj[2] = s3;
		obj[3] = s4;
		obj[4] = s5;

		for (int i = 0; i < obj.length; i++) {
			//fills the objects
			if (i % 2 == 0) {
				obj[i].setFilled(true);
			} else {
				obj[i].setFilled(false);
			}
			//displays the area and if its colored
			System.out.println(obj[i].getArea()+ " ");
			obj[i].howToColor();
		}

	}

}
