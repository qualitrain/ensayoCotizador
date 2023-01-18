package mx.com.qtx.negocio;

public abstract class Componente {
	protected int id;
	private static int idMaxAct=0; 
	protected String marca;
	protected String modelo;
	protected double costo;
	protected double precioBase;
	protected String tipo;
	
	public abstract String getTipo();
	public abstract TipoComponente getTipoComponente();
	
	public static Componente crearComponente(String marca, String modelo, double costo, double precioBase, 
			TipoComponente tipoComponente, String capacidad, String memoria) {
		Componente unComponente = null;
		switch (tipoComponente) {
		case DISCO:
			unComponente = new DiscoDuro(marca, modelo, costo, precioBase, capacidad);
			return unComponente;
		case TARJETA_VIDEO:
			unComponente = new TarjetaVideo(marca, modelo, costo, precioBase, memoria);
			return unComponente;
		case MONITOR:
			unComponente = new Monitor(marca, modelo, costo, precioBase);
			return unComponente;
		case PC:
			return null;
		default:
			break;
		}
		return null;
	}

	protected Componente(String marca, String modelo, double costo, double precioBase) {
		super();
//		System.out.println("Componente(...)");
		Componente.idMaxAct++;
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
		this.precioBase = precioBase;
		this.id = Componente.idMaxAct;
//		System.out.println(this);
	}
	
	public static Pc crearComponente(PcBuilder config) {
		Pc pc = new Pc(config.getMarca(), config.getModelo());
		pc.setComponentesPc(config.getComponentesPc());
		return pc;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double calcularUtilidad(){
		double utilidad = precioBase - costo;
		return utilidad;
	}
	
	public String getDescripcion() {
		String descripcion = 
				this.getTipo() + " " + 
		        " marca " + this.marca + ", "
				+ "modelo " + this.modelo;
		return descripcion;	
	}
	
	public void mostrarCaracteristicas(){
		System.out.println("Id:" + id);
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Costo:" + costo);
		System.out.println("Precio Base:" + precioBase);
	}
	
	public double cotizar(int cantidad) {
		return cantidad * precioBase;
	}
	@Override
	public String toString() {
		return "Componente [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + ", precioBase="
				+ precioBase + ", tipo=" + tipo + "]";
	}
	
}
