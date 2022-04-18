package Proyecto.Unidad11.intstream;

import java.util.stream.IntStream;

public class EjemploMapIntStream {

	
	
	public static void main(String[] args) {
	
		
	System.out.println("\nMap");
	IntStream streamRange = IntStream.range(5, 10); 
	streamRange.forEach(x->System.out.print(x+","));
	System.out.println("\nCalculamos el cubo para todos los elementos del Stream");
	IntStream.range(5, 10).map(x-> (int) Math.pow(x, 3)).forEach(x->System.out.print(x+","));
	
	
	}
	
	
}



