package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

public interface InterfaceGestion {
	
	boolean aniade(VehiculoJ obj);
	
	boolean ataca(String idAtacante, String idAtacado);
	
	VehiculoJ obten(String id);
	
	boolean elimina(String id);

}
