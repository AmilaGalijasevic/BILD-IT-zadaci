package zadaci_10_02_2016;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;

	// constructors
	public Employee() {

	}

	public Employee(String office, double salary, Date dateHired) {
		super();
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	// getters and setters
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	//returns employee data and data from person class
	public String toString() {
		return "Employee [Person [name=" + getName() + ", adress=" + getAdress() + ", phone=" + getPhone() + ", mail="
				+ getMail() + ",office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}

}
