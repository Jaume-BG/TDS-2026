package um.tds.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Alerta {
	private int id;
	private int limite;
	private EstrategiaPeriodoAlerta periodicidad;
	private Categoria categoria;
	private List<Notificacion> historial;

	public Alerta(int id, int limite, EstrategiaPeriodoAlerta periodicidad) {
		this.id = id;
		this.limite = limite;
		this.periodicidad= periodicidad;
		this.categoria = null;
	}

	public Alerta(int id, int limite, Categoria categoria, EstrategiaPeriodoAlerta periodicidad) {
		this.id = id;
		this.limite = limite;
		this.periodicidad = periodicidad;
		this.categoria = categoria;
		this.historial = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public EstrategiaPeriodoAlerta getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(EstrategiaPeriodoAlerta periodicidad) {
		this.periodicidad = periodicidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Notificacion> getHistorial() {
		return historial;
	}

	public void setHistorial(List<Notificacion> historial) {
		this.historial = historial;
	}

	public boolean evaluar(List<Gasto> gastos) {
		if (gastos == null || gastos.isEmpty()) {
			return false;
		}

		LocalDate hoy = LocalDate.now();
		LocalDate inicio = periodicidad.inicioPeriodo(hoy);
		LocalDate fin = periodicidad.finPeriodo(hoy);

		int importeAcumulado = gastos.stream().filter(this::cumpleAmbitoCategoria)
				.filter(g -> estaDentroDelPeriodo(g.getFecha(), inicio, fin)).mapToInt(Gasto::getImporte).m.sum();

		boolean superado = importeAcumulado > this.limite;

		if (superado) {
			generarNotificacion(importeAcumulado);
		}

		return superado;
	}

	private boolean cumpleAmbitoCategoria(Gasto gasto) {
		if (this.categoria == null) {
			return true;
		}
		return this.categoria.equals(gasto.getCategoria());
	}

	private boolean estaDentroDelPeriodo(LocalDate fechaGasto, LocalDate inicio, LocalDate fin) {
		if (fechaGasto == null) {
			return false;
		}
		return !fechaGasto.isBefore(inicio) && !fechaGasto.isAfter(fin);
	}

	private void generarNotificacion(int importeAcumulado) {
		String nombreCategoria = (categoria != null) ? categoria.getNombre() : "General";
		String mensaje = String.format("Alerta superada [%s]: gasto acumulado de %s € frente a un límite de %s €.",
				nombreCategoria, importeAcumulado, this.limite);
		Notificacion notificacion = new Notificacion(LocalDateTime.now(), mensaje, importeAcumulado, this.limite);
		this.historial.add(notificacion);
	}

}
