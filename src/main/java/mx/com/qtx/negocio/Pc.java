package mx.com.qtx.negocio;

import java.util.ArrayList;

public class Pc extends Componente {
	private ArrayList<Componente> componentesPc;

	public Pc(String marca, String modelo) {
		super(marca, modelo, 0, 0);
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

	public ArrayList<Componente> getComponentesPc() {
		return componentesPc;
	}

	public void setComponentesPc(ArrayList<Componente> componentesPc) {
		this.componentesPc = componentesPc;
	}

	@Override
	public TipoComponente getTipoComponente() {
		return TipoComponente.PC;
	}

	public ArrayList<String> getMarcasComponente(TipoComponente tipoBuscado) {
		ArrayList<String> marcas = new ArrayList<>();
		for(Componente componenteI : this.componentesPc) {
			if(componenteI.getTipoComponente() == tipoBuscado) {
				marcas.add(componenteI.getMarca());
			}
		}		
		return marcas;
	}
	
}
