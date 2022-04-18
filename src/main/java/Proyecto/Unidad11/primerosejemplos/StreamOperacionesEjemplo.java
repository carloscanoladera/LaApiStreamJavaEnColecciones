package Proyecto.Unidad11.primerosejemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperacionesEjemplo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Array de numeros");
		
		List<Integer> lista = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);
		
		
		lista.stream().forEach( x->System.out.print(x+","));  
		
		lista.stream().forEach((i)-> System.out.println(i) );
		
		System.out.println("\nFiltramos por números pares");
		
		List<Integer> lista1 = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);
		List<Integer > lista2 =lista1
		.stream()
		.filter(n->n%2==0)
		.collect( Collectors.collectingAndThen(Collectors.toList(), Collections::<Integer> unmodifiableList));   // 
	
		
		lista2.stream().forEach((i)-> System.out.println(i) );
		
		
		
		System.out.println("\nFiltramos por n�meros pares y multiplicamos cada numero par por dos y le sumamos 1");
		Map<String, Integer>map= 
		lista2
		.stream()	
		.filter(n->n%2==0)
		.map(n -> (Integer) 2 * n + 1)
		.collect( Collectors.toMap(i-> String.valueOf(i), Function.identity()));  
		
			Double media =map.values()
		.stream()
		.filter(n->n%2==0)
		.map(n -> 2 * n + 1)
		.collect(Collectors.averagingInt(x->x));
		
			System.out.println("\nRecogemos la lista anterior  y filtramos por n�meros pares y multiplicamos cada numero par por dos y le sumamos 1. Calculamos la media:" + media);
	
		
		
	}


}


