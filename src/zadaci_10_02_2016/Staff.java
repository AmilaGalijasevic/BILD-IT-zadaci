package zadaci_10_02_2016;

import java.util.Date;

public class Staff extends Employee {
	private String title;

	// constructors
	public Staff() {
	}

	public Staff(String office, double salary, Date dateHired) {
		super(office, salary, dateHired);

	}

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}

}
