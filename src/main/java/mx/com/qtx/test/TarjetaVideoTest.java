package mx.com.qtx.test;

import mx.com.qtx.negocio.TarjetaVideo;
import mx.com.qtx.negocio.TipoComponente;

public class TarjetaVideoTest {
	public static void main(String[] args) {
		probarCotizar();
	}
	public static void probarCotizar() {
		System.out.println("- probarCotizar -");
		TarjetaVideo tarjeta = new TarjetaVideo("Nvidia", "Perrus", 1000, 2000, TipoComponente.TARJETA_VIDEO, "8Gb");
		double cotizacion5 = tarjeta.cotizar(5);
		if(cotizacion5==8000) {
			System.out.println("Cotizacion de 5 es correcta");
		}
		else
			System.out.println("Cotizacion de 5 es incorrecta " + cotizacion5);
		double cotizacion6 = tarjeta.cotizar(6);
		if(cotizacion6==8000) {
			System.out.println("Cotizacion de 6 es correcta");
		}
		else
			System.out.println("Cotizacion de 6 es incorrecta " + cotizacion6);
		double cotizacion8 = tarjeta.cotizar(8);
		if(cotizacion8==12000) {
			System.out.println("Cotizacion de 8 es correcta");
		}
		else
			System.out.println("Cotizacion de 8 es incorrecta " + cotizacion8);
		
	}
	
}
