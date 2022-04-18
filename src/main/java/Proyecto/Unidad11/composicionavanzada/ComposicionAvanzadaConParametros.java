package Proyecto.Unidad11.composicionavanzada;

import java.util.Scanner;
import java.util.function.Function;

public class ComposicionAvanzadaConParametros{

	public Function <Integer,Integer> composicionAvanzadaConParametros (Function<Integer,Integer> interface1,Function<Integer,Integer> interface2,Function<Integer,Integer> interface3) {
	
		return  interface1.andThen(interface2).andThen(interface3);
	}
		
		public static void main(String[] args) {
		
			Integer numero1;
			Scanner miScanner = new Scanner(System.in);  
			
			
		    System.out.println("Escriba un n�mero entero");
		    numero1 = miScanner.nextInt();
		    
			
			
			ComposicionAvanzadaConParametros ejemploAvanzada = new ComposicionAvanzadaConParametros();
		
			
			Function <Integer,Integer> funcionResultado =
					ejemploAvanzada.composicionAvanzadaConParametros( x -> x*x, x->x-7, x->x/3);
			
		   System.out.println("El resultado de combinar los tres interfaces es:" + funcionResultado.apply(numero1));
				
	}
	
	
}


