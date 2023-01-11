package mx.com.qtx.negocio;

public class Pc extends Componente {
	private Monitor monitorPc;
	private TarjetaVideo tarjetaPc;
	private DiscoDuro[] discosPc;

	public Pc(String marca, String modelo, double costo, double precioBase, 
			   TipoComponente tipoComponente, int nDiscos) {
		super(marca, modelo, costo, precioBase, tipoComponente);
		this.discosPc = new DiscoDuro[nDiscos];
	}

	public Monitor getMonitorPc() {
		return monitorPc;
	}

	public void setMonitorPc(Monitor monitorPc) {
		this.monitorPc = monitorPc;
	}

	public TarjetaVideo getTarjetaPc() {
		return tarjetaPc;
	}

	public void setTarjetaPc(TarjetaVideo tarjetaPc) {
		this.tarjetaPc = tarjetaPc;
	}

	public DiscoDuro[] getDiscosPc() {
		return discosPc;
	}

	public void setDiscosPc(DiscoDuro[] discosPc) {
		this.discosPc = discosPc;
	}

	@Override
	public double cotizar(int cantidad) {
		double total = 0;
		total += this.monitorPc.getPrecioBase();
		total += this.tarjetaPc.getPrecioBase();
		total += this.discosPc[0].getPrecioBase();
		if(this.discosPc.length == 2) {
			total += this.discosPc[1].getPrecioBase();
		}
		total *= 0.8;
		return total;		
	}

}
