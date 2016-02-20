package zadaci_19_02_2016;

import java.util.Arrays;

public class Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// adds students
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// getters and setters
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	// overrides the clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", students=" + Arrays.toString(students) + ", numberOfStudents="
				+ numberOfStudents + "]";
	}

}
