package zadaci_06_02_2016;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// constructor default capacity 16
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// constructor with the specified maximum capacity
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// checks if its empty
	public boolean empty() {
		return size == 0;
	}

	// returns the top element from the stack
	public int peek() {
		return elements[size - 1];
	}

	// pushes integers to top off the stack
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// Returns and removes the top element from the stack
	public int pop() {
		return elements[--size];
	}

	public int getSize() {
		return size;
	}

}
