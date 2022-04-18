package Proyecto.Unidad11.intstream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamAgregacion {

	
	
	public static void main(String[] args) {
		
		int suma = IntStream.range(1, 10).sum(); 
		
		System.out.println("La suma del IntStream es:" +suma);
		
		
		OptionalDouble media = IntStream.range(1, 10).average();
		System.out.println("La media del IntStream es:" +media.getAsDouble());
		
		
		IntSummaryStatistics  estadisticas= IntStream.range(1, 10).summaryStatistics();
		
		System.out.println("Datos para el Stream. Media:" + estadisticas.getAverage() + " Suma:" +
		estadisticas.getSum() +" Mínimo: " + estadisticas.getMin() + " Máximo:" + estadisticas.getMax()+
		" total elementos " + estadisticas.getCount());
		
		
		IntSummaryStatistics  estadisticas2= IntStream.range(4, 12).summaryStatistics();
		estadisticas.combine(estadisticas2);
		
		System.out.println("Datos para el Stream. Media:" + estadisticas.getAverage() + " Suma:" +
				estadisticas.getSum() +" M�nimo: " + estadisticas.getMin() + " M�ximo:" + estadisticas.getMax()+
				" total elementos " + estadisticas.getCount());
				
				
				
		
		
	}
	
}
