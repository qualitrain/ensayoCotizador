package mx.com.qtx.test;

import mx.com.qtx.casosDeUso.Cotizador;
import mx.com.qtx.negocio.Componente;
import mx.com.qtx.negocio.Monitor;
import mx.com.qtx.negocio.TarjetaVideo;
import mx.com.qtx.negocio.TipoComponente;

public class CotizadorTest {

	public static void main(String[] args) {
		probarAgregarDetalleCotizacion();
		probarEmitirCotizacion();
	}

	public static void probarAgregarDetalleCotizacion() {
		System.out.println("- probarAgregarDetalleCotizacion -");
		Componente componente1 = new Componente("Sony","X-100",1500,3000,TipoComponente.MONITOR);
		Componente componente2 = new Componente("Hitachi","Y-10",1200,3000,TipoComponente.DISCO);
		Componente componente3 = new Componente("Lg","Z-1",1800,3500,TipoComponente.TARJETA_VIDEO);
		
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

		Componente monitor1 = new Monitor("Sony","X-100",1500,3000, TipoComponente.MONITOR);
		Componente componente2 = new Componente("Hitachi","Y-10",1200,3000,TipoComponente.DISCO);
		TarjetaVideo componente3 = new TarjetaVideo("Lg","Z-1",500,1000,TipoComponente.TARJETA_VIDEO,"8Gb");
		
		Cotizador unCotizador = new Cotizador(5);
		unCotizador.agregarDetalleCotizacion(5, monitor1);
		unCotizador.agregarDetalleCotizacion(2, componente2);
		unCotizador.agregarDetalleCotizacion(3, componente3);
		
		unCotizador.emitirCotizacion();
		
	}
}
