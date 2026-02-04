package empleadoTech;

import java.time.LocalDate;

public class MainEmpleadoTech {

	public static void main(String[] args) {
		EmpleadoTech doctora = new EmpleadoTech("Sonia", "Sermeño", LocalDate.of(1950, 11, 22), Departamento.DEVELOPMENT, 1500f, 0.005f, null);
		EmpleadoTech secretaria = new EmpleadoTech("Patricia", "Carrasco Toro", LocalDate.of(1981, 04, 12), Departamento.QA, 1000f, 0.002f, doctora);
		EmpleadoTech reflecsologo1 = new EmpleadoTech("Milkarla", "Mendoza Carrasco", LocalDate.of(1995, 02, 18), Departamento.IA, 750f, 0.001f, secretaria );
		secretaria.setSueldo(1100f);
		
//		System.out.println(secretaria);
//		System.out.println(secretaria.getIRPF());
//		EmpleadoTech.maxSupervisor(secretaria);
//		secretaria.maxSupervisor();
		System.out.println(EmpleadoTech.maxSupervisor(reflecsologo1));
//		System.out.println(reflecsologo1.maxSupervisor());
	}

}
