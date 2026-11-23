package um.tds.modelo;

public class Categoria {
	private String nombre;
	private int id;
	private boolean predefinida;
	
	public Categoria(String nombre, int id, boolean predefinida) {
		this.nombre = nombre;
		this.id = id;
		this.predefinida = predefinida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPredefinida() {
		return predefinida;
	}

	public void setPredefinida(boolean predefinida) {
		this.predefinida = predefinida;
	}
	
	

}
