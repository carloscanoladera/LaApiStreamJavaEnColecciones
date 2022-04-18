package Proyecto.Unidad11.composicionavanzada;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class EjemploDeComposicionAvanzadaPuntosSuspensivos<T> {

	
	public EjemploDeComposicionAvanzadaPuntosSuspensivos() {
		
		
		
		
		
	}
	
	
	public void ComposicionAvanzada (T i, Function<T,T> ... interfaces) {
		
		T valor = interfaces[0].apply(i);
		
		System.out.println(valor);
	    Optional<Function<T, T>> opt = Stream.of(interfaces).reduce((funcComb, func)-> funcComb.andThen(func));
	    opt.ifPresent(x -> System.out.println("El resultado de aplicar los interfaces funcionales a la variable " + i + " es " +x.apply(i) ));
	
	    Stream.of(interfaces).
	    reduce((funcComb, func)-> funcComb.andThen(func)).
	    ifPresent(x -> System.out.println("El resultado de aplicar los interfaces funcionales a la variable " + i + " es " +x.apply(i) ));
	    
	    
	}
	
	
	
	
	public static void main(String[] args) {
		
		EjemploDeComposicionAvanzadaPuntosSuspensivos<Integer> ejemploAvanzada = new EjemploDeComposicionAvanzadaPuntosSuspensivos();
		
		ejemploAvanzada.ComposicionAvanzada(10, x -> x*x, x->x-7, x->x/3, x->x*5, x->2*x, y->5*y/2);
		
		}
	
	
}
