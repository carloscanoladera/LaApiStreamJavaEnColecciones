package Proyecto.Unidad11.otrosejemplosdeapistream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Empleado {
	
	int id;
	String nombre;
	public Empleado (int id, String nombre) {
		
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


public class MiEjemploApiStream {
	
	  public static final List<String>  lista = (List<String>) Arrays.asList("ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL");

	
	  
	  
	  
	
	public static void main(String[] args) {
		
	
		IntStream streamRange = IntStream.range(5, 50); 
		
		
		streamRange.mapToDouble(x-> Double.valueOf(x)).filter(x-> x%2==0).forEach(x-> System.out.println(x+","));
		
		OptionalDouble  miOptional = IntStream.range(5, 50).average();	
		
		miOptional.ifPresent(x-> System.out.println("La media es:"+x));
		
		
		 lista.stream().filter(nombre->nombre.toUpperCase().startsWith("A")).forEach(System.out::println);

		 List<String> resultado = lista.parallelStream()
				 						.filter(nombre->nombre.toUpperCase().startsWith("A"))
				 						.collect(Collectors.toList());
		 
		 
		 
		 List<Empleado> listaEmpleados =IntStream.range(0, lista.size())
				 								 .mapToObj(i-> new Empleado(i,lista.get(i)))
				 								 .collect(Collectors.toList()); 
		 
		 listaEmpleados.stream()
		 			   .sorted((e1,e2)-> e1.getNombre().compareTo(e2.getNombre()))
		 			   .forEach(System.out::println);
		 
		 
		 
		 
		 listaEmpleados.stream().anyMatch(e->e.getNombre().toUpperCase().equals("ANTONIO"));
		 
		 listaEmpleados.stream().filter(e->e.getNombre().toUpperCase().equals("ANTONIO")).findAny().ifPresent(System.out::println);
		 
		 
	}

}
