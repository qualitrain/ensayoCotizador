package mx.com.qtx.demoMapas;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

import mx.com.qtx.negocio.Componente;

public class DemoMapas {

	public static void main(String[] args) {
		Map<String,String> mapaEstados = new HashMap<>();
		
		HashMap<String,Componente> mapaComponentes = 
				new HashMap<>();
		
		// Inserción de duplas llave-valor //
		mapaEstados.put("CDMX", "Ciudad de México");
		mapaEstados.put("EDOMEX", "Estado de México");
		mapaEstados.put("OAX", "Oaxaca");
		mapaEstados.put("PUE", "Puebla");
		
		//Buscar una llave particular
		
		String estadoBuscado = mapaEstados.get("OAX");
		System.out.println("estado buscado:" + estadoBuscado);
		
		//Iterando llaves
		System.out.println("\nLas llaves son:");
		for(String llaveI:mapaEstados.keySet()) {
			System.out.println("llave:" + llaveI);
		}
		
		System.out.println("\nLas llaves son:");
		mapaEstados.keySet()
		.forEach(llaveI -> System.out.println("llave:" + llaveI));	
		
		//Iterando Valores
		System.out.println("\nLos valores son:");
		for(String valorI: mapaEstados.values()) {
			System.out.println("valor:" + valorI);
		}
		
		//Buscando varios elementos
		
		String[] estadosBuscados = {"PUE","OAX"};
		for(String edoBuscadoI:estadosBuscados) {
			String valor = mapaEstados.get(edoBuscadoI);
			System.out.println("valor encontrado:" + valor);
		}
		
		// Borrar un elemento
		mapaEstados.remove("OAX");
		
		System.out.println("\nLos valores son:");
		for(String valorI: mapaEstados.values()) {
			System.out.println("valor:" + valorI);
		}
	
	}

}
