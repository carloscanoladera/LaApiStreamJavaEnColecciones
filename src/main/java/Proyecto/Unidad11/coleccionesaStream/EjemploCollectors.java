package Proyecto.Unidad11.coleccionesaStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

public class EjemploCollectors {
	
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};

	 
	  
		public static void main(String[] args) {
			
			
		 List<EmpleadoEnLista> listaEmpleados = IntStream.range(0, nombres.length).mapToObj(i->new EmpleadoEnLista(i,nombres[i])).collect(Collectors.toList());
	
		 
		 System.out.println("\n Acumulando en lista");
	     // Acumulamos nombres en la lista
	     List<String> list = listaEmpleados.stream().map(EmpleadoEnLista::getNombre).collect(Collectors.toList());

	     list.forEach((e)->System.out.print(e+","));
	     
	     // Acumulamos nombres en el TreeSet
	     System.out.println("\n Acumulando en treeSet");
	     Set<String> set = listaEmpleados.stream().map(EmpleadoEnLista::getNombre).collect(Collectors.toCollection(TreeSet::new));

	     set.forEach((e)->System.out.print(e+","));
	     
	     // Acumulamos nombres en el TreeSet
	     System.out.println("\n Acumulando en treeSet");
	     Set<String> set2 = listaEmpleados.stream().map(EmpleadoEnLista::getNombre).collect(Collectors.toSet());

	     set.forEach((e)->System.out.print(e+","));
	     
	     
	     // Acumulamos nombres en el HashMap
	     
	     Map<Integer, String> map =listaEmpleados.stream().collect(Collectors.toMap(e->e.getId(),e->e.getNombre()));
	     System.out.println("\n Acumulando en Map");
	     

	     map.entrySet().forEach((e)->System.out.print(e+","));
	     
	     // Convert elements to strings and concatenate them, separated by commas
	     
		}
	     
	     
	  

}
