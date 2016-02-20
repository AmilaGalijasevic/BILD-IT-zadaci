package zadaci_18_02_2016;

public class Square extends GeometricObject implements Colorable {
	int s = 0;

	public Square(int s) {
		this.s = s;
	}
//calculates area
	double getArea() {
		return (s * s);
	}

	@Override
	//overrides the method 
	public void howToColor() {
		if (isFilled()) {
			System.out.println("Color all four sides");
		} else {
			System.out.println("No color");
		}
	}

}
