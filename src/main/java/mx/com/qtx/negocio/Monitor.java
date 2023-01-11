package mx.com.qtx.negocio;

public class Monitor extends Componente{

	/*
	 * public Monitor(String marca, String modelo, double costo, double precioBase,
	 * String tipo) { super(marca, modelo, costo, precioBase, tipo); }
	 */	
	public Monitor(String marca, String modelo, double costo, double precioBase, TipoComponente tipoComponente) {
		super(marca, modelo, costo, precioBase, tipoComponente);
	}

	@Override
	public double cotizar(int cantidad) {
		if(cantidad < 3)
			return super.cotizar(cantidad);
		if(cantidad <= 5)
			return super.cotizar(cantidad) * 0.95;
		return super.cotizar(cantidad) * 0.90;
	}

}
