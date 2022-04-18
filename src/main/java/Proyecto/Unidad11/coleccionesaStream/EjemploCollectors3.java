package Proyecto.Unidad11.coleccionesaStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableList;

class EmpleadoEnCollectorsStat {
	
	int id;
	String nombre;
	public EmpleadoEnCollectorsStat (int id, String nombre) {
		
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
	
	public static Long TransformaALongIdEmpleado(int id) {
		
		return Long.valueOf(id);
	}

	
	public String toString () {
		
	return "{id:"+ this.getId() + ", nombre:" + this.getNombre() + "}";
	}
	
}



public class EjemploCollectors3 {
	
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};


	  public static int transformaAEntero(String cadenaNumerica) {
		  
		  return Integer.parseInt(cadenaNumerica);
		  
	  }
	  
	  
		public static void main(String[] args) {
			
			
		 List<EmpleadoEnCollectorsStat> listaEmpleados = IntStream.range(0, nombres.length).mapToObj(i->new EmpleadoEnCollectorsStat(i,nombres[i])).collect(Collectors.toList());
	
		 
		 System.out.println("\n Acumulando en lista");
	     // Acumulamos nombres en la lista
	     List<String> listCadenas = listaEmpleados.stream().map(EmpleadoEnCollectorsStat::getNombre).collect(Collectors.toList());

	     listCadenas.forEach((e)->System.out.print(e+","));
	     
	     
	     System.out.println("\n Contando id pares");
	     Long contandoPares = listaEmpleados.stream().filter(e -> e.getId() % 2 == 0).collect(Collectors.counting());
	     System.out.println("\n Contando id pares: " +  contandoPares);
	    
	     
	     
	     Optional<EmpleadoEnCollectorsStat> empleadoNombreMayor = listaEmpleados.stream().collect(Collectors.maxBy((e1, e2)->e1.getNombre().compareTo(e2.getNombre())));
	     System.out.println("\n Retorna empleado Maximo nombre");
	     empleadoNombreMayor.ifPresent( System.out::print);

	   
	     
	     Optional<EmpleadoEnCollectorsStat> empleadoIdMenor = listaEmpleados.stream().collect(Collectors.minBy((e1, e2)->e1.getId() - e2.getId()));
	     System.out.println("\n Retorna empleado id Minimo");
	     empleadoIdMenor.ifPresent( System.out::print);
	     
	     
	     Double media = Stream.of("12", "23", "1").collect(Collectors.averagingDouble(Double::parseDouble)); 

	     System.out.println("\n Aplicando media a un Stream:" + media);
	     
	     
	     int mediaEntero = Stream.of("12", "23", "1").collect(Collectors.summingInt(EjemploCollectors3::transformaAEntero)); 

	     System.out.println("\n Aplicando suma a un Stream:" + mediaEntero); 
	     
	     int SumaIds= 
	    		 listaEmpleados.stream().map(e->e.getId()).collect(Collectors.summingInt((x)->(int) x));
	     System.out.println("\n Aplicando la suma de todos los id's de empleados del stream a un Stream:" + media);
	     
	     
	   
	     
		}
	     
	     
	  

}
