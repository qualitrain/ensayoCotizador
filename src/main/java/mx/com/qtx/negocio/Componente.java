package mx.com.qtx.negocio;

public class Componente {
	protected String marca;
	protected String modelo;
	protected double costo;
	protected double precioBase;
	protected String tipo;
	protected TipoComponente tipoComponente;
	

	public Componente(String marca, String modelo, double costo, double precioBase, TipoComponente tipoComponente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
		this.precioBase = precioBase;
		this.tipoComponente = tipoComponente;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public TipoComponente getTipoComponente() {
		return tipoComponente;
	}


	public void setTipoComponente(TipoComponente tipoComponente) {
		this.tipoComponente = tipoComponente;
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
		String descripcion = this.tipoComponente + " " + " marca " + this.marca + ", "
				+ "modelo " + this.modelo;
		return descripcion;	
	}
	
	public void mostrarCaracteristicas(){
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Costo:" + costo);
		System.out.println("Precio Base:" + precioBase);
	}
	
	public double cotizar(int cantidad) {
		return cantidad * precioBase;
	}
}
