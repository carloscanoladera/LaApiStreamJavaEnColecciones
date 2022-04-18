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

class EmpleadoEnCollectorsAgrup {
	
	int id;
	String nombre;
	public EmpleadoEnCollectorsAgrup (int id, String nombre) {
		
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



public class EjemploCollectors4 {
	
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};


	  public static boolean compruebaPar(EmpleadoEnCollectorsAgrup empl) {
		  
		  return empl.getId()%2==0;
		  
	  }
	  
	  
		public static void main(String[] args) {
			
			
		 List<EmpleadoEnCollectorsAgrup> listaEmpleados = IntStream.range(0, nombres.length).mapToObj(i->new EmpleadoEnCollectorsAgrup(i,nombres[i])).collect(Collectors.toList());
	
		 
		 System.out.println("\n Acumulando en lista");
	     // Acumulamos nombres en la lista
	     List<String> listCadenas = listaEmpleados.stream().map(EmpleadoEnCollectorsAgrup::getNombre).collect(Collectors.toList());

	     listCadenas.forEach((e)->System.out.print(e+","));
	     
	     
	    

	     
	 	 Map<String,List<EmpleadoEnCollectorsAgrup>> mapAgrupadoInicial = 
	    		listaEmpleados.stream().collect(Collectors.groupingBy((e)->e.getNombre().substring(0,1) ));
	
	    
	    
	    
	    System.out.println("\n Map agrupando por inicial" + mapAgrupadoInicial);
	     
	     
	   
	    
	    Map<Boolean, List<EmpleadoEnCollectorsAgrup>> mapAgrupadoIdpar = 
	    		 listaEmpleados.stream().collect(Collectors.partitioningBy((e)->e.getId()%2==0));
	    		 
	    		 
	    		   System.out.println("\n Map agrupando por id par o impar, false impar, true par" + mapAgrupadoIdpar);
	    		   
	    		   
	    		   Map<Boolean, List<EmpleadoEnCollectorsAgrup>> mapAgrupadoIdpar2 = 
	    		    		 listaEmpleados.stream().collect(Collectors.partitioningBy(EjemploCollectors4::compruebaPar));
	    		    		 
	    		    		 
	    		    		   System.out.println("\n Map agrupando por id par o impar, false impar, true par" + mapAgrupadoIdpar);
		}
	     
	     
	  

}
