package Proyecto.Unidad11.composicionavanzada;


import java.util.function.Function;

import java.util.Scanner;


public class ComposicionAvanzadaConParametrosPuntosSuspensivos{

	public Function <Integer,Integer> composicionAvanzadaConParametrosPuntos (Function<Integer,Integer> ... paramInterfaces ) {
	
		Function <Integer,Integer > resultado = x->x;
		
		for (Function <Integer,Integer> interfaz: paramInterfaces) {
			
			
		
			resultado = resultado.andThen(interfaz);

		}
		
		return resultado;
	}
		

	
	
		public static void main(String[] args) {
		
			Integer numero1;
			Scanner miScanner = new Scanner(System.in);  
			
			
		    System.out.println("Escriba un n�mero entero");
		    numero1 = miScanner.nextInt();
		    
			
			
		    ComposicionAvanzadaConParametrosPuntosSuspensivos ejemploAvanzada = new ComposicionAvanzadaConParametrosPuntosSuspensivos();
		
			
			Function <Integer,Integer> funcionResultado =
					ejemploAvanzada.composicionAvanzadaConParametrosPuntos( x -> x*x, x->x-7, x->x*3);
			
		   System.out.println("El resultado de combinar los interfaces es:" + funcionResultado.apply(numero1));
				
	}
	

}
