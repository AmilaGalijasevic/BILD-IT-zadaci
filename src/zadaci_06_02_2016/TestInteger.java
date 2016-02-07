package zadaci_06_02_2016;

public class TestInteger {

	public static void main(String[] args) {
		// new object
		MyInteger m = new MyInteger(12);
		// displays the outputs of the methods in the class myInteger
		System.out.println(m.isEven());
		System.out.println(m.isOdd());
		System.out.println(m.isPrime());
		System.out.println(MyInteger.isEven(7));
		System.out.println(MyInteger.isPrime(9));
		System.out.println(MyInteger.issOdd(13));
		System.out.println(MyInteger.equals(12));
		System.out.println(MyInteger.equals(m));
		// new char array for turning it to integers
		char[] c = { '6', '6', '6' };
		System.out.println(MyInteger.parseInt(c));
		// new string
		String s = "666";
		System.out.println(MyInteger.parseInt(s));
	}

}
