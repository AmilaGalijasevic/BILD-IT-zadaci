package zadaci_05_02_2016;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// three objects
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		// displays their perimetar and area depending on the inputed values
		
		System.out.println("Perimetar: " + rp1.getPerimetar() + " Area: " + rp1.getArea());
		System.out.println("Perimetar: " + rp2.getPerimetar() + " Area: " + rp2.getArea());
		System.out.println("Perimetar: " + rp3.getPerimetar() + " Area: " + rp3.getArea());
	}

}
