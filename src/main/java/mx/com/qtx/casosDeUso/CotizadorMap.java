package mx.com.qtx.casosDeUso;

import java.util.HashMap;
import java.util.Map;

import mx.com.qtx.negocio.Componente;
import mx.com.qtx.test.ICotizador;

public class CotizadorMap implements ICotizador{
	private Map<Integer,Componente> mapaComponentes;
	private Map<Integer,Integer> mapaCantidades;

	public CotizadorMap() {
		super();
		this.mapaComponentes = new HashMap<>();
		this.mapaCantidades = new HashMap<>();
	}
	public void agregarDetalleCotizacion(int cantidad, Componente componente) {
		this.mapaComponentes.put(componente.getId(), componente);
		this.mapaCantidades.put(componente.getId(), cantidad);
	}
	public void emitirCotizacion() {
		double total = 0;
		for(Integer idI:this.mapaComponentes.keySet()) {
			Componente componenteI = this.mapaComponentes.get(idI);
			int cantComponenteI = this.mapaCantidades.get(idI);
			double totalDetalleI = componenteI.cotizar( cantComponenteI);
			total += totalDetalleI;
			System.out.println(cantComponenteI + " " + "id:"+idI + " " +  componenteI.getDescripcion() 
					+ " cuestan " + totalDetalleI);
		}
		System.out.println("Total general: " + total);		
	}
	public int getnDetalles() {
		return this.mapaComponentes.size();
	}
	
	public int getCantidadComponente(int id) {
		return this.mapaCantidades.get(id);
	}
}
