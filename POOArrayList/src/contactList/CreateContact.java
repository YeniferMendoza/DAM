package contactList;

import java.time.LocalDate;

public class CreateContact {

	public static void main(String[] args) {
		Contact uno = new Contact("Sebas", "fara", LocalDate.of(1996,06,22), "mail", "direct");
		Contact dos = new Contact("Yeni", "fara", LocalDate.of(2001,03,03), "mail", "direct");
		Contact tres = new Contact("patri", "fara", LocalDate.of(1981,04,12), "mail", "direct");
		
		ContactList lista = new ContactList();
		lista.AddContact(uno);
		lista.AddContact(dos);
		lista.AddContact(tres);
		
		System.out.println(dos);
		
	}


}
