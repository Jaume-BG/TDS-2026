package um.tds.modelo;

import java.time.LocalDate;

public class Gasto {

	//ATRIBUTOS
	private long id;
	private int importe;
	private LocalDate fecha;
	private String concepto;
	private String categoria;

	//CONSTRUCTOR
	public Gasto(long id, int importe, LocalDate fecha, String concepto, String categoria) {
		this.id = id;
		this.importe = importe;
		this.fecha = fecha;
		this.concepto = concepto;
		this.categoria = categoria;
	}

	//GETTERS
	public long getId() {
		return id;
	}

	public int getImporte() {
		return importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public String getCategoria() {
		return categoria;
	}

}
