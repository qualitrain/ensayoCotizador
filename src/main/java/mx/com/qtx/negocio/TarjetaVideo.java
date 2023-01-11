package mx.com.qtx.negocio;

public class TarjetaVideo extends Componente {
	private String memoria;

	/*
	 * public TarjetaVideo(String marca, String modelo, double costo, double
	 * precioBase, String tipo, String memoria) { super(marca, modelo, costo,
	 * precioBase, tipo); this.memoria = memoria; }
	 */	
	public TarjetaVideo(String marca, String modelo, double costo, double precioBase, 
			String memoria) {
		super(marca, modelo, costo, precioBase);
		this.memoria = memoria;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	@Override
	public double cotizar(int cantidad) {
		int unidadesXcotizar = (cantidad / 3) * 2 + (cantidad % 3);
		return unidadesXcotizar * this.getPrecioBase();
	}

	@Override
	public String getTipo() {
		return "Tarjeta de Video";
	}

}
