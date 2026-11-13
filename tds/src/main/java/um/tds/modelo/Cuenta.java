package um.tds.modelo;

import java.util.ArrayList;

public class Cuenta {
	
	//ATRIBUTOS
	private long id;
	private String nombre;
	
	
	//CONSTRUCTOR
	public Cuenta(long id, String nombre) {
		this.nombre = nombre;
		id = Integer.toUnsignedLong(nombre.hashCode());
	}


	//GETTERS
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	//FUNCIONALIDAD
	public int registrarGasto(Gasto gasto) {
		return 0;
	}
	
	public int eliminarGasto(long id) {
		return 0;
	}
	
	public ArrayList obtenerGastos() {
		return new ArrayList();
	}
	
	
	
	
}
