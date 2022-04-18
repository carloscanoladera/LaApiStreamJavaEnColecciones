package Proyecto.Unidad11.operadoresespeciales;

import java.util.Optional;

import java.util.stream.Stream;

public class OperadorPuntosSuspensivos {

 public OperadorPuntosSuspensivos() {
	 
	 
	 
 }
 
 
 public void funcionConPuntosSuspensivosCadena(String ...strings  ) {
	 
	 for (String parametro: strings) {
		 
		 System.out.println(parametro);
		 
	 }
	 
 }

public void funcionConPuntosSuspensivosCadenaVersionLambda(String ...strings  ) {
	 
	
	System.out.println("Version lambda");
	 Stream.of(strings).forEach(System.out::println);
	 
 }

 
 
 public int funcionConPuntosSuspensivosEnteros (String nombre, int ...numeros ) {
	 
	 int suma=0;
	 for (int parametro: numeros) {
		 
		 suma= parametro+ suma;
		 
	 }
	 
	
	 return suma;
	 
	 
 }
 
 
 public Optional funcionConPuntosSuspensivosEnterosVersionLambda (String nombre, Integer ...numeros ) {
	 
	 int suma=0;
	
	 
	 System.out.println(nombre);
	 return Stream.of(numeros).reduce((sumaAcumulada,numero)-> sumaAcumulada+numero);
	  
	  
	 
	 
 }
 
 
	public static void main(String[] args) {
		
		
		OperadorPuntosSuspensivos opPuntos = new OperadorPuntosSuspensivos();
		
		opPuntos.funcionConPuntosSuspensivosCadena("hola","cadena","adios","cadena2");
		
		opPuntos.funcionConPuntosSuspensivosCadenaVersionLambda("hola","cadena","adios","cadena2lambda", "lambda exp");
		
		int suma = opPuntos.funcionConPuntosSuspensivosEnteros("Version normal", 1,2,3,4,7,9,0);
		
		System.out.println("devuelve la suma de los n�meros pasados como par�metro: "+ suma);
		
		Optional<Integer> optSuma= opPuntos.funcionConPuntosSuspensivosEnterosVersionLambda("Version lambda", 4,5,6,1,2,3,4,7,9,0);
		
		optSuma.ifPresent(sumaLambda-> System.out.println("devuelve la suma de los n�meros pasados como par�metro: "+ sumaLambda));
	
	}

}
