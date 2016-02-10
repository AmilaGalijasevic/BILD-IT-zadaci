package zadaci_10_02_2016;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		// creates new objects
		Student s = new Student("Junior");
		Employee e = new Employee();
		Faculty f = new Faculty();
		Staff staff = new Staff();
		// sets students data
		s.setName("Jane Doe");
		s.setAdress("York");
		s.setMail("student@mail.com");
		s.setPhone("000-000-000");
		// seta employee data
		e.setName("John Smith");
		e.setAdress("London");
		e.setMail("neko@mail.com");
		e.setPhone("+38732-666-683");
		e.setOffice("Chemisrty");
		e.setDateHired(new Date());
		e.setSalary(45000);
		// faculty data
		f.setOfficeH(8);
		f.setRank("Professor");
		// staff data
		staff.setTitle("Employed");
		// prints their data
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(staff.toString());

	}

}
