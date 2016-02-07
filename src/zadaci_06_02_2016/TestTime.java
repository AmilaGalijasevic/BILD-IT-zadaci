package zadaci_06_02_2016;

public class TestTime {

	public static void main(String[] args) {
		//creates new objects
		Time t = new Time(555550000);
		Time t1 = new Time();
		//displays the time for the objects
		System.out.println("Elapsed time in 5555500000 millieseconds is: "+t.toString()+ "\nCurrent time: " + t1.toString());

	}

}
