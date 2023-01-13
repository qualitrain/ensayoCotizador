package mx.com.qtx.negocio;

import java.util.ArrayList;

public class PcBuilder {
	private String marca;
	private String modelo;
	public static int MAX_DISCOS = 2;
	public static int MAX_MONITORES = 1;
	public static int MAX_TARJETAS = 1;
	private ArrayList<Componente> componentesPc;
	
	public PcBuilder(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.componentesPc = new ArrayList<>();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static int getMAX_DISCOS() {
		return MAX_DISCOS;
	}

	public static void setMAX_DISCOS(int mAX_DISCOS) {
		MAX_DISCOS = mAX_DISCOS;
	}

	public static int getMAX_MONITORES() {
		return MAX_MONITORES;
	}

	public static void setMAX_MONITORES(int mAX_MONITORES) {
		MAX_MONITORES = mAX_MONITORES;
	}

	public static int getMAX_TARJETAS() {
		return MAX_TARJETAS;
	}

	public static void setMAX_TARJETAS(int mAX_TARJETAS) {
		MAX_TARJETAS = mAX_TARJETAS;
	}

	public ArrayList<Componente> getComponentesPc() {
		return componentesPc;
	}

	public void setComponentesPc(ArrayList<Componente> componentesPc) {
		this.componentesPc = componentesPc;
	}

	public PcBuilder agregarDisco(String marca, String modelo, double costo, double precioBase, 
			 String capacidad) {
		Componente discoI = Componente.crearComponente(marca, modelo, costo, precioBase, TipoComponente.DISCO, capacidad, capacidad);
		this.componentesPc.add(discoI);
		return this;		
	}
	
	public PcBuilder agregarMonitor(String marca, String modelo, double costo, double precioBase) {
		Componente monitorI = Componente.crearComponente(marca, modelo, costo, precioBase, TipoComponente.MONITOR, null, null);
		this.componentesPc.add(monitorI);
		return this;		
	}
	
	public PcBuilder agregarTarjeta(String marca, String modelo, double costo, double precioBase, 
			String memoria) {
		Componente tarjetaI = Componente.crearComponente(marca, modelo, costo, precioBase, TipoComponente.MONITOR, null, memoria);
		this.componentesPc.add(tarjetaI);
		return this;		
	}
	
	public int getNcomponentes(TipoComponente tipoBuscado) {
		int nOcurrencias = 0;
		for(Componente componenteI:this.componentesPc) {
			switch (tipoBuscado) {
			case DISCO:
				if(componenteI instanceof DiscoDuro)
					nOcurrencias++;
				break;
			case MONITOR:
				if(componenteI instanceof Monitor)
					nOcurrencias++;
				break;
			case TARJETA_VIDEO:
				if(componenteI instanceof TarjetaVideo)
					nOcurrencias++;
				break;
			}
		}
		return nOcurrencias;
	}

	public int getNcomponentesB(TipoComponente tipoBuscado) {
		int nOcurrencias = 0;
		for(Componente componenteI:this.componentesPc) {
			if(componenteI.getTipoComponente() == tipoBuscado)
				nOcurrencias++;
		}
		return nOcurrencias;
	}

	public Pc build() {
		return Componente.crearComponente(this);
	}
}
