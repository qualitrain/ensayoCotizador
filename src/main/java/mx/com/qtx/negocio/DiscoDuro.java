package mx.com.qtx.negocio;

public class DiscoDuro extends Componente {
	protected String capacidad;

	public DiscoDuro(String marca, String modelo, double costo, double precioBase, 
			 String capacidad) {
		super(marca, modelo, costo, precioBase);
		this.capacidad = capacidad;
	}

	@Override
	public String getTipo() {
		return "Disco Duro";
	}

	@Override
	public TipoComponente getTipoComponente() {
		return TipoComponente.DISCO;
	}

}
