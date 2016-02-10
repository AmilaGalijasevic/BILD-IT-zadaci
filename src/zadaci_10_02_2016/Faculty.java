package zadaci_10_02_2016;

import java.util.Date;

public class Faculty extends Employee {
	private double officeH;
	private String rank;

	// constructors
	public Faculty() {

	}
	public Faculty(String office, double salary, Date dateHired, double officeH, String rank) {
		super(office, salary, dateHired);
		this.officeH = officeH;
		this.rank = rank;
	}
	// getters and setters
	public double getOfficeH() {
		return officeH;
	}
	public void setOfficeH(double officeH) {
		this.officeH = officeH;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty [officeH=" + officeH + ", rank=" + rank + "]";
	}

}
