package zadaci_05_02_2016;

public class TestFan {

	public static void main(String[] args) {
		// new fan objects
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		// sets the values for first object
		fan1.setOn(true);
		fan1.setColor("yellow");
		fan1.setSpeed(fan1.getFAST());
		fan1.setRadius(10);
		// sets the second object off
		fan2.setOn(false);
		fan2.setRadius(5);
		fan2.setSpeed(2);
		fan2.setColor("blue");
		// prints properties
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
