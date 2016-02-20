package zadaci_19_02_2016;

public class TestCourse {

	public static void main(String[] args) throws CloneNotSupportedException {
		// new course object
		Course c = new Course("Java");
		// adds names of students
		for(int i = 0; i < 100; i++){
			c.addStudent("Ensar");
		}
		// clones the object
		Course clone = (Course) c.clone();
		// prints first object
		System.out.println(c.toString());
		// prints seconf object
		System.out.println(clone.toString());

	}

}
