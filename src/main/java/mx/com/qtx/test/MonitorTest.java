package mx.com.qtx.test;

import mx.com.qtx.negocio.Componente;
import mx.com.qtx.negocio.TipoComponente;

public class MonitorTest {
	public static void main(String[] args) {
		probarCotizar();
	}
	public static void probarCotizar() {
		System.out.println("- probarCotizar -");
		Componente monitor = Componente.crearComponente("Sony", "Maximus", 1000, 2000, TipoComponente.MONITOR, null, null);
		double cotizacion2 = monitor.cotizar(2);
		if(cotizacion2 == 4000)
			System.out.println("Cotizacion de 2 monitores es correcta");
		else
			System.out.println("Cotizacion de 2 monitores es incorrecta: " + cotizacion2);
		double cotizacion3 = monitor.cotizar(3);
		if(cotizacion3 == (2000 * 3 * 0.95 ))
			System.out.println("Cotizacion de 3 monitores es correcta");
		else
			System.out.println("Cotizacion de 3 monitores es incorrecta: " + cotizacion3);
		double cotizacion6 = monitor.cotizar(6);
		if(cotizacion6 == (2000 * 6 * 0.90 ))
			System.out.println("Cotizacion de 6 monitores es correcta");
		else
			System.out.println("Cotizacion de 6 monitores es incorrecta: " + cotizacion6);
		double cotizacion10 = monitor.cotizar(10);
		if(cotizacion10 == (2000 * 10 * 0.90 ))
			System.out.println("Cotizacion de 10 monitores es correcta");
		else
			System.out.println("Cotizacion de 10 monitores es incorrecta: " + cotizacion10);
		
	}
}
