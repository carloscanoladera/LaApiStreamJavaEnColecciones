package Proyecto.Unidad11.intstream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EjemplosBasicos {

	
	public static void main(String[] args) {
		

		
		System.out.println("Con iterator");
		
		IntStream.iterate(0, i -> i + 2).limit(10).forEach(x->System.out.print(x+","));
		
		IntStream stream = IntStream.generate(() 
	            -> { return (int)(Math.random() * 10000); }); 
	 
		System.out.println("\nCon generate");
		
		stream.limit(10).forEach(x->System.out.print(x+",")); 
		
		
		System.out.println("\nCon range");
		IntStream streamRange = IntStream.range(5, 10); 
		streamRange.forEach( x->System.out.print(x+",") );  //5,6,7,8,9
         
		
		System.out.println("\nCon close range");
        //Closed Range
        IntStream streamClosedRange = IntStream.rangeClosed(5, 10); 
        streamClosedRange.forEach( x->System.out.print(x+",") );   //5,6,7,8,9,10
	
	}
	
}
