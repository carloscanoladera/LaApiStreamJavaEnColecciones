package Proyecto.Unidad11.coleccionesaStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.collect.ImmutableList;

class EmpleadoEnCollectors {
	
	int id;
	String nombre;
	public EmpleadoEnCollectors (int id, String nombre) {
		
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

public class EjemploCollectors2 {
	
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};

	 
	  
		public static void main(String[] args) {
			
			
		 List<EmpleadoEnCollectors> listaEmpleados = IntStream.range(0, nombres.length).mapToObj(i->new EmpleadoEnCollectors(i,nombres[i])).collect(Collectors.toList());
	
		 
		 System.out.println("\n Acumulando en lista");
	     // Acumulamos nombres en la lista
	     List<String> listCadenas = listaEmpleados.stream().map(EmpleadoEnCollectors::getNombre).collect(Collectors.toList());

	     listCadenas.forEach((e)->System.out.print(e+","));
	     
	     
	     
	     // Acumulamos nombres en el HashMap
	     
	     Map<Integer, String> map =listaEmpleados.stream().collect(Collectors.toUnmodifiableMap(e->e.getId(),e->e.getNombre()));
	     System.out.println("\n Creando en Map inmutable");
	     try {
	     	map.put(20, "nombre");
	     	
	     } catch (UnsupportedOperationException e) {
	    	 
	    	 e.printStackTrace();
	     };

	     map.entrySet().forEach((e)->System.out.print(e+","));
	     
	     System.out.println("\n Creando lista inmutable");
	     
	    List<String> listInmutable = 
	    		listCadenas
	    		.stream()
	    		 .collect(Collectors 
                         .collectingAndThen( 
                             Collectors.toList(), 
                             Collections::<String> unmodifiableList)); 
	    
	    
	    listInmutable.forEach((e)->System.out.print(e+","));
	    
	    System.out.println("\n Creando lista inmutable google");
	    
	    List<String> listInmutableGoogle = 
	    		listCadenas
	    		.stream()
	    		 .collect(Collectors 
                         .collectingAndThen( 
                             Collectors.toList(), 
                             ImmutableList::copyOf));
	    
	    
	     
	    listInmutableGoogle.forEach((e)->System.out.print(e+","));
	     
	     

	    
	    String resultadoJoining = listCadenas.stream().collect(Collectors.joining());
	    		
	    System.out.println("\n Resultado joining: " +resultadoJoining);
	   
	    
	    String resultadoJoining1Separador= listCadenas.stream().collect(Collectors.joining(","));
		
	    System.out.println("\n Resultado joining con separador " +resultadoJoining1Separador);
	    
	    System.out.println("\n Filtramos empleados que empiecen por a y los metemos en un conjunto ");
	    
	    Set<EmpleadoEnCollectors> setFiltrado = listaEmpleados.stream().collect(Collectors.filtering(e->e.getNombre().startsWith("A"), Collectors.toSet()));
	     
	    setFiltrado.forEach((e)->System.out.print(e+","));
	    
	    
	    
	    
	    
	    
		}
	     
	     
	  

}
