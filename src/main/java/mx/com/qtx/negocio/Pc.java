package mx.com.qtx.negocio;

import java.util.ArrayList;

public class Pc extends Componente {
	private ArrayList<Componente> componentesPc;

	public Pc(String marca, String modelo, double costo, double precioBase, 
			   TipoComponente tipoComponente) {
		super(marca, modelo, costo, precioBase);
	}

	@Override
	public double cotizar(int cantidad) {
		double total = 0;
		
		for(Componente componenteI:this.componentesPc) {
			total+= componenteI.getPrecioBase();
		}
		total *= 0.8;
		return total;		
	}

	@Override
	public String getTipo() {
		return "Computadora Armada";
	}

}
