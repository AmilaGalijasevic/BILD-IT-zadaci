package zadaci_06_02_2016;

public class MyInteger {

	static int value;

	// constructor
	public MyInteger(int value) {
		super();
		MyInteger.value = value;
	}

	public int getValue() {
		return value;
	}

	// calculates even numbers
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// calculates odd numbers
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// calculates primes
	public boolean isPrime() {
		int c = 0;
		for (int i = value; i >= 1; i--) {
			if (value % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	// calculates even numbers for specified value
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// calculates odd numbers for specified value
	public static boolean issOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

	// calculates for specified value
	public static boolean isPrime(int value) {
		int c = 0;
		for (int i = value; i >= 1; i--) {
			if (value % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	// checks if the values are equal
	public static boolean equals(int value) {
		if (MyInteger.value == value) {
			return true;
		} else {
			return false;
		}
	}

	// checks if the object is equal to a value
	public static boolean equals(MyInteger a) {
		if (MyInteger.equals(value)) {
			return true;
		} else {
			return false;
		}
	}

	// turns char to integer
	public static int parseInt(char[] a) {
		return parseInt(new String(a));

	}

	// turns string to integer
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}

}
