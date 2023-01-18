package mx.com.qtx.test;

import mx.com.qtx.negocio.Componente;

public interface ICotizador {
	void agregarDetalleCotizacion(int cantidad, Componente componente);
	void emitirCotizacion();
	int getnDetalles();
	int getCantidadComponente(int id);
}
