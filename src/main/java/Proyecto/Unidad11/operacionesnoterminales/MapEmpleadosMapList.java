package Proyecto.Unidad11.operacionesnoterminales;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



	class EmpleadoEnLista {
		
		int id;
		String nombre;
		
		public EmpleadoEnLista (int id, String nombre) {
			
			this.id=id;
			this.nombre=nombre;
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		public String toString () {
			
		return "{id:"+ this.getId() + ", nombre:" + this.getNombre() + "}";
		}
		
	}
	
	public class MapEmpleadosMapList {
		
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};


	

	
	
	public static void main(String[] args) {
		

		HashMap <Integer,EmpleadoEnLista> mapEmpleados= new HashMap <Integer,EmpleadoEnLista>();
				 IntStream.range(0, nombres.length).forEach((i)-> mapEmpleados.put(i, new EmpleadoEnLista(i, nombres[i])));
				 System.out.println("Imprimimos hashmap");
				 mapEmpleados.entrySet().stream().forEachOrdered((e)->System.out.print(e+","));
			
				 
				 
			List<EmpleadoEnLista> listaEmpleados	= mapEmpleados.entrySet().stream().map((E) -> E.getValue()).collect(Collectors.toList());
			System.out.println("Imprimimos lista");
			listaEmpleados.stream().forEachOrdered((e)->System.out.print(e+","));
			
	}
	
	
	
}
