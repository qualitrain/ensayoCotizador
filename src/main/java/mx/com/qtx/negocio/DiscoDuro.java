package mx.com.qtx.negocio;

public class DiscoDuro extends Componente {
	protected String capacidad;

	public DiscoDuro(String marca, String modelo, double costo, double precioBase, 
			TipoComponente tipoComponente, String capacidad) {
		super(marca, modelo, costo, precioBase, tipoComponente);
		this.capacidad = capacidad;
	}

}
