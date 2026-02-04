package contactList;

public class MainContact {
	public static void main(String[] args) {
		ContactList lista = new ContactList();
		Contact c1 =new Contact("Sebastián", "Faranna", null, null, null);
		lista.AddContact(c1);
		Contact c2 =new Contact("Yenifer", "Mendoza", null, null, null);
		lista.AddContact(c2);
		Contact c3 =new Contact("Carlos", "Faranna", null, null, null);
		lista.AddContact(c3);
		lista.sort();
		System.out.println(lista);
	}

}
