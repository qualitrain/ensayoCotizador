package mx.com.qtx.test;

import mx.com.qtx.casosDeUso.Cotizador;
import mx.com.qtx.negocio.Componente;
import mx.com.qtx.negocio.TipoComponente;

public class CotizadorTest {

	public static void main(String[] args) {
		probarAgregarDetalleCotizacion();
		probarEmitirCotizacion();
	}

	public static void probarAgregarDetalleCotizacion() {
		System.out.println("- probarAgregarDetalleCotizacion -");
		Componente componente1 = Componente.crearComponente("Sony","X-100",1500,3000,TipoComponente.MONITOR, null, null);
		Componente componente2 = Componente.crearComponente("Hitachi","Y-10",1200,3000,TipoComponente.DISCO, "1Tb", null);
		Componente componente3 = Componente.crearComponente("Lg","Z-1",1800,3500,TipoComponente.TARJETA_VIDEO, null, "4Gb");
		
		Cotizador unCotizador = new Cotizador(5);
		unCotizador.agregarDetalleCotizacion(5, componente1);
		unCotizador.agregarDetalleCotizacion(2, componente2);
		unCotizador.agregarDetalleCotizacion(3, componente3);
		
		if(unCotizador.getnDetalles() == 3) {
			if( (unCotizador.getCantidades()[1])==2 ) {
				System.out.println("AgregarDetalleCotizacion funciona OK");
			}
			else
				System.out.println("AgregarDetalleCotizacion Erroneo");				
		}
		else
			System.out.println("AgregarDetalleCotizacion Erroneo");							
	}
	
	public static void probarEmitirCotizacion() {
		System.out.println("- probarEmitirCotizacion -");

		Componente monitor1 = Componente.crearComponente("Sony","X-100",1500,3000,TipoComponente.MONITOR, null, null);
		Componente componente2 = Componente.crearComponente("Hitachi","Y-10",1200,3000,TipoComponente.DISCO, "1Tb", null);
		Componente componente3 = Componente.crearComponente("Lg","Z-1",1800,3500,TipoComponente.TARJETA_VIDEO, null, "4Gb");
		
		Cotizador unCotizador = new Cotizador(5);
		unCotizador.agregarDetalleCotizacion(5, monitor1);
		unCotizador.agregarDetalleCotizacion(2, componente2);
		unCotizador.agregarDetalleCotizacion(3, componente3);
		
		unCotizador.emitirCotizacion();
		
	}
}
