package orientadaObjetos;

public class Empleado {
	private String name;
	private String surname;
	private float sueldo;
	private String domicilio;
	private int contacto;

public Empleado() {
	
}
public Empleado(String name, String surname, float sueldo, String domicilio, int contacto) {
	this.name = name;
	this.surname = surname;
	this.sueldo = sueldo;
	this.domicilio = domicilio;
	this.contacto = contacto;
}

public String getName() {
	return this.name;
}
public String getSurname() {
	return this.surname;
}
public float getSueldo() {
	return this.sueldo;
}
public String getDomicilio() {
	return this.domicilio;
}
public int getContacto() {
	return this.contacto;
}


public void setName(String name) {
	this.name = name;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public void setSueldo(float sueldo) {
	this.sueldo = sueldo;
}
public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public void setContacto(int contacto) {
	this.contacto = contacto;
}

public String toString() {
	return String.format("%s %s con direccion %s y numero de contacto %d, %.2f",name, surname, domicilio, contacto, sueldo);
}

public float getIRPF(float sueldo) {
	float irpf = 0.0f;
	if(this.sueldo >= 10000 && this.sueldo < 15000) {
		irpf =  0.02f;
	}
	else if(this.sueldo >= 15000 && this.sueldo < 20000) {
		irpf =  0.10f;
	}
	else if(this.sueldo >= 20000 && this.sueldo < 30000) {
		irpf =  0.02f;
	}else {
		irpf = 0.33f;
	}
	
	return irpf;
}
public static float IRPF() {
//	float irpf = 0.0f;
//	if(this.sueldo >= 1000 && this.sueldo < 15000) {
//		
//	}irpf =  0.02f;
//	
//	return irpf;
	return 0;
}



}
