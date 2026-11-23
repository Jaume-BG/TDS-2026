package um.tds.modelo;

import java.time.LocalDate;

public class Gasto {

	//ATRIBUTOS
	private int id;
	private int importe;
	private LocalDate fecha;
	private String concepto;
	private Categoria categoria;

	//CONSTRUCTOR
	public Gasto(int id, int importe, LocalDate fecha, String concepto, Categoria categoria) {
		this.id = id;
		this.importe = importe;
		this.fecha = fecha;
		this.concepto = concepto;
		this.categoria = categoria;
	}

	//GETTERS
	public int getId() {
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

	public Categoria getCategoria() {
		return categoria;
	}

}
