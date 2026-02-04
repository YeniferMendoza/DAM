package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

import java.util.ArrayList;

public class GestionVehiculo implements InterfaceGestion{
	
	private ArrayList<VehiculoJ> lista;
	
	public GestionVehiculo(ArrayList<VehiculoJ> lista) {
		this.lista= lista;
	}
	
	public GestionVehiculo(VehiculoJ...VehiculosJ) {
		this.lista= new ArrayList<VehiculoJ>();
		for(VehiculoJ v: VehiculosJ) {
			this.lista.add(v);
		}
	}
	
	public GestionVehiculo() {
		this.lista= new ArrayList<VehiculoJ>();
	}
	
	
	public static void repararDaniado(ArrayList<VehiculoJ> lista, float nivel) {
		for(VehiculoJ v: lista) {
			if(v.resistencia < nivel ) {
				v.setResistencia(nivel);
			}
		}
	}
	
	public static boolean eliminarDestruidos(ArrayList<VehiculoJ> lista){
		ArrayList<VehiculoJ> list = new ArrayList<VehiculoJ>();
		for(VehiculoJ v : lista) {
			if(v.resistencia <= 0) {
				list.add(v);
			}
		}
		for(VehiculoJ v: list) {
			lista.remove(v);
		}
		return true;
	}
	
	public static void eliminarDestruidosRemuveAll(ArrayList<VehiculoJ> lista){
		ArrayList<VehiculoJ> list = new ArrayList<VehiculoJ>();
		for(VehiculoJ v : lista) {
			if(v.resistencia <= 0) {
				list.add(v);
			}
		}
		lista.removeAll(list);
	}
	
	

	public VehiculoJ buscarPorId(String id) {
		for(VehiculoJ vehiculo: this.lista) {
			if(vehiculo.identificador.equalsIgnoreCase(id)) {
				return vehiculo;
			}
		}
		return null;
	}
	
	public boolean existe(VehiculoJ v) {
		for(VehiculoJ vehiculo: this.lista) {
			if(vehiculo.equals(v)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean aniade(VehiculoJ obj) {
		if(this.existe(obj)) {
			return this.lista.add(obj);
		}
		return false;
	}

	@Override
	public boolean ataca(String idAtacante, String idAtacado) {
		this.buscarPorId(idAtacado).resistencia -= this.buscarPorId(idAtacante).ataque.getPAtaque();
//		this.buscarPorId(idAtacado).resistencia -= this.buscarPorId(idAtacante).ataque.poderResta();
		return true;
	}

	@Override
	public VehiculoJ obten(String id) {
		return this.buscarPorId(id);
	}

	@Override
	public boolean elimina(String id) {
		return lista.remove(this.buscarPorId(id));
	}
	

}
