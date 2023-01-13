package mx.com.qtx.test;

import mx.com.qtx.negocio.Componente;
import mx.com.qtx.negocio.Pc;
import mx.com.qtx.negocio.PcBuilder;
import mx.com.qtx.negocio.TipoComponente;

public class ComponenteTest {

	public static void main(String[] args) {
		probarCalcularUtilidad();
		probarMostrarCaracteristicas();
		probarSetMarca();
		probarCotizar();
		probarCrearYcotizarPcConBuilder();
		probarCrearYcotizarPcConBuilderYbuild();
		probarGetMarcasComponente();
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
	public static void probarCrearYcotizarPcConBuilder() {
		System.out.println("- probarCrearYcotizarPcConBuilder -");
		PcBuilder miConfig = new PcBuilder("Dell","X-56");
		
		miConfig.agregarDisco("Seagate", "S100", 500, 1000, "2TB")
		        .agregarDisco("Sony", "SS500", 560, 1200, "500Gb")
		        .agregarMonitor("Samsung", "S500", 800, 2000)
		        .agregarTarjeta("NVidia", "X-2000", 570, 1000, "2GB");
		
		Pc miPc = Componente.crearComponente(miConfig);
		double precioCotizado = miPc.cotizar(1);
		if(precioCotizado == ((1000 + 1200 + 2000 + 1000)*0.8)) {
			System.out.println("Pc creada y cotizada correctamente =o)");
		}
		else
			System.out.println("Pc creada y/o cotizada erróneamente:" + precioCotizado);
		
	}
	public static void probarCrearYcotizarPcConBuilderYbuild() {
		System.out.println("- probarCrearYcotizarPcConBuilderYbuild -");
		PcBuilder miConfig = new PcBuilder("Dell","X-56");
		
		Pc miPc =miConfig.agregarDisco("Seagate", "S100", 500, 1000, "2TB")
		        .agregarDisco("Sony", "SS500", 560, 1200, "500Gb")
		        .agregarMonitor("Samsung", "S500", 800, 2000)
		        .agregarTarjeta("NVidia", "X-2000", 570, 1000, "2GB")
		        .build();
		
		double precioCotizado = miPc.cotizar(1);
		if(precioCotizado == ((1000 + 1200 + 2000 + 1000)*0.8)) {
			System.out.println("Pc creada y cotizada correctamente =o)");
		}
		else
			System.out.println("Pc creada y/o cotizada erróneamente:" + precioCotizado);
		
	}
	public static void probarGetMarcasComponente() {
		System.out.println("- probarGetMarcasComponente -");
		PcBuilder miConfig = new PcBuilder("Dell","X-56");
		
		Pc miPc =miConfig.agregarDisco("Seagate", "S100", 500, 1000, "2TB")
		        .agregarDisco("Sony", "SS500", 560, 1200, "500Gb")
		        .agregarMonitor("Samsung", "S500", 800, 2000)
		        .agregarTarjeta("NVidia", "X-2000", 570, 1000, "2GB")
		        .build();
		
		System.out.println(miPc.getMarcasComponente(TipoComponente.DISCO));
		
	}
	
}
