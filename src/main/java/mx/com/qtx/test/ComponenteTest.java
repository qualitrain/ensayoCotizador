package mx.com.qtx.test;

import mx.com.qtx.negocio.Componente;
import mx.com.qtx.negocio.TipoComponente;

public class ComponenteTest {

	public static void main(String[] args) {
		probarCalcularUtilidad();
		probarMostrarCaracteristicas();
		probarSetMarca();
		probarCotizar();
	}
	public static void probarCalcularUtilidad() {
		//Instanciar un objeto de la clase
		Componente miComponente = Componente.crearComponente("Sony","X-100",1500,3000, TipoComponente.MONITOR, null, null);
		double utilidad = miComponente.calcularUtilidad();
		if(utilidad == 1500) {
			System.out.println("probarCalcularUtilidad funciona OK");
		}
		else
		{
			System.out.println("probarCalcularUtilidad es errónea!");			
		}
	}
	public static void probarMostrarCaracteristicas() {
		System.out.println("- probarMostrarCaracteristicas -");
		Componente miComponente = Componente.crearComponente("Sony","X-100",1500,3000, TipoComponente.MONITOR, null, null);
		miComponente.mostrarCaracteristicas();
	}
 
	public static void probarSetMarca() {
		System.out.println("- probarSetMarca -");
		Componente miComponente = Componente.crearComponente("Sony","X-100",1500,3000, TipoComponente.MONITOR, null, null);
		miComponente.setMarca("H3");
		
		if(miComponente.getMarca().equals("H3")) {
			System.out.println("setMarca funciona OK");			
		}
		else {
			System.out.println("setMarca errónea");
		}
	}
	
	public static void probarCotizar() {
		System.out.println("- probarCotizar -");
		Componente miComponente = Componente.crearComponente("Sony","X-100",1500,3000, TipoComponente.MONITOR, null, null);
		double precioCotizado = miComponente.cotizar(10);
		if(precioCotizado == 30000 * .9) {
			System.out.println("cotizar funciona OK");						
		}
		else {
			System.out.println("cotizar erróneo");									
		}
	}
	
}
