package mx.com.qtx.casosDeUso;

import mx.com.qtx.negocio.Componente;

public class Cotizador {
	private int[] cantidades;
	private Componente[] componentes;
	private int nDetalles;

	public Cotizador(int size) {
		super();
		cantidades = new int[size];
		componentes = new Componente[size];
		nDetalles = 0;
	}

	
	public int[] getCantidades() {
		return cantidades;
	}


	public void setCantidades(int[] cantidades) {
		this.cantidades = cantidades;
	}


	public Componente[] getComponentes() {
		return componentes;
	}


	public void setComponentes(Componente[] componentes) {
		this.componentes = componentes;
	}


	public int getnDetalles() {
		return nDetalles;
	}


	public void setnDetalles(int nDetalles) {
		this.nDetalles = nDetalles;
	}


	public void agregarDetalleCotizacion(int cantidad, Componente componente) {
		cantidades[nDetalles] = cantidad;
		componentes[nDetalles] = componente;
		nDetalles++;
	}
	public void emitirCotizacion() {
		double total = 0;
		for(int i=0; i<this.nDetalles; i++) {
			double totalDetalleI = this.componentes[i].cotizar( this.cantidades[i]);
			total += totalDetalleI;
			System.out.println(this.cantidades[i] + " " + this.componentes[i].getDescripcion() 
					+ " cuestan " + totalDetalleI);
		}
		System.out.println("Total general: " + total);
	}


	public static void main(String[] args) {
		System.out.println("Saludos a todos");
	}

}
