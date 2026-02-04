package contactList;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContactList {
	private ArrayList<Contact> contactList;
 
	public ContactList() {
		this.contactList = new ArrayList<Contact>();
	}
	public ContactList(ArrayList<Contact> contactList) {
		this.contactList = contactList;
	}
	public ContactList(Contact... contact) {
		for(Contact c: contact) {
			this.contactList.add(c);
		}
	}

	
	//3-Busca el contacto
	public Contact searchContact(String name, String surname) {
		for (Contact contact : this.contactList) {
			if (contact.getName().equalsIgnoreCase(name)
					&& contact.getSurname().equalsIgnoreCase(surname)){
				return contact;
			}
		}
		return null;
	}
	
	/**
	 * 1-Método para añadir un nuevo contacto. 
	 * Recibe el nuevo contacto y comprueba que no exista ya un contacto con el mismo nombre y apellidos.
	 * @param newContact
	 */
	public void AddContact(Contact newContact){
//		if(!contactList.contains(newContact)){
//			contactList.add(newContact);	
//		}

		if (null == searchContact(newContact.getName(), newContact.getSurname())) {
			this.contactList.add(newContact);
		}
	}
	
	//2-borra un contacto
	public boolean removeContact(String name, String surname) {
		Contact contact = searchContact(name, surname);
		if(null != contact) {
			this.contactList.remove(contact);
			return true;
		}
		return false;
	}
	
	//Ordenar(ejercicio incompleto)
	public void sort() {
		for(int i = 0; i < contactList.size()-1; i++) {
			for(int j = 0; j < contactList.size()-i-1; j++ ) {
				if(contactList.get(j).getSurname().compareToIgnoreCase(contactList.get(j+1).getSurname()) > 0 || 
						(contactList.get(j).getSurname().compareToIgnoreCase(contactList.get(j+1).getSurname()) == 0 &&
							contactList.get(j).getName().compareToIgnoreCase(contactList.get(j+1).getName()) > 0) ) {
					Contact variable = contactList.get(j);
					contactList.set(j, contactList.get(j+1));
					contactList.set(j+1, variable);
				}
			}
		}
	}
	
	//5-modifica el contacto
	public boolean updateContact(Contact contact) {
		Contact oldContact = searchContact(contact.getName(), contact.getSurname());
		if(oldContact != null && !contact.equals(oldContact)) {
			int index = this.contactList.indexOf(oldContact);
			this.contactList.set(index, contact);
			return true;
		}
		return false;
	}
	
	//6-devuelve la lista
	public String toString() {
		String retorno = "";
		for (Contact contact : this.contactList)
			retorno+=contact;
		return retorno;
	}
	
	//7-Busca todos los contactos por fecha de nacimiento//
	public ArrayList<Contact> searchContactBirthdate(LocalDate birthdate1, LocalDate birthdate2 ) {
		ArrayList<Contact> newList= new ArrayList<>();
		for (Contact contact : this.contactList) {
			if (contact.getBirthdate().isAfter(birthdate1)&& contact.getBirthdate().isBefore(birthdate2) ){
				newList.add(contact);
				return newList;
			}
		}
		return newList;
	}

	
	public ArrayList<Contact> getContactList() {
		return this.contactList;
	}

	public void setContactList(ArrayList<Contact> contactList) {
		this.contactList = contactList;
	}

}
