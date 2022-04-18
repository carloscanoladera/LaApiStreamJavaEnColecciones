package Proyecto.Unidad11.composicionavanzada;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class EjemploDeComposicionAvanzadaPuntosSuspensivosRefactorizado<T> {

	
	public EjemploDeComposicionAvanzadaPuntosSuspensivosRefactorizado() {
		
			
		
		
	}
	
	
	public Function<T,T> ComposicionAvanzada ( Function<T,T> ... interfaces) {
		
	
		
	    return Stream.of(interfaces).reduce(Function.identity(), Function::andThen);
	       
	    
	}
	
	
	
	
	public static void main(String[] args) {
		
		int i =9;
		EjemploDeComposicionAvanzadaPuntosSuspensivosRefactorizado<Integer> ejemploAvanzada = new EjemploDeComposicionAvanzadaPuntosSuspensivosRefactorizado();
		
		Function<Integer,Integer> funcion = ejemploAvanzada.ComposicionAvanzada( x -> x*x, x->x-7, x->x/3, x->x*5, x->2*x, y->5*y/2);
		
		 System.out.println("El resultado de aplicar los interfaces funcionales a la variable " + i + " es " + funcion.apply(i));

	
		
	}
	
	
}
