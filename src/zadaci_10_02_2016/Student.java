package zadaci_10_02_2016;

public class Student extends Person {
	
	private final String status;

	// constructor
	public Student(String status) {
		this.status = status;
	}

	// getter method
	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Student [Person [name=" + getName() + ", adress=" + getAdress() + ", phone=" + getPhone() + ", mail="
				+ getMail() + " , status=" + status + "]";
	}

}
