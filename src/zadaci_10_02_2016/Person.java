package zadaci_10_02_2016;

public class Person {
	// data fields
	private String name;
	private String adress;
	private String phone;
	private String mail;

	public Person() {

	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + ", phone=" + phone + ", mail=" + mail + "]";
	}

}
