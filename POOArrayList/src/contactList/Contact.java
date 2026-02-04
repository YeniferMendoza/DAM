package contactList;

import java.time.LocalDate;

public class Contact {
	private String name;
	private String surname;
	private LocalDate birthdate;
	private String mail;
	private String direction;
	
	public Contact() {
	}
	
	public Contact(String name, String surname, LocalDate birthdate, String mail, String direction) {
		this.name= name;
		this.surname= surname;
		this.birthdate= birthdate;
		this.mail= mail;
		this.direction= direction;
	}
	
	public String toString() {
		return String.format("%s %s %s %s %s \n\n", this.name, this.surname, this.birthdate, this.mail, this.direction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direction;
	}

	public void setDireccion(String direccion) {
		this.direction = direccion;
	}
	

}
