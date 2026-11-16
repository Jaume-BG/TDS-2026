package um.tds.modelo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cuenta {
	
	//ATRIBUTOS
	private String nombre;
	
	private HashMap<Long, Gasto> lista_gastos;
	
	
	//CONSTRUCTOR
	public Cuenta(String nombre) {
		this.nombre = nombre;
		lista_gastos = new HashMap<>();
	}


	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	
	//FUNCIONALIDAD
	public int registrarGasto(Gasto gasto) {
		//Caso de exito
		if(lista_gastos.put(gasto.getId(), gasto) != null) {
			return 0;
		}
		
		//Caso de fallo
		return 1;
	}
	
	public int eliminarGasto(long id) {
		//Caso de exito
		if(lista_gastos.remove(id) != null) return 0;
		
		//Caso de fallo
		return 1;
	}
	
	public Map <Long, Gasto> obtenerGastos() {
		return Collections.unmodifiableMap(lista_gastos);
	}
	
	
	
	
}
