package Proyecto.Unidad11.coleccionesaStream;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableList;



public class ColeccionesInmutablesGoogle {
	
	public static void main(String[] args) {
	
	   List<String> lista= Arrays.asList("hola","mundo", "como estas");
       
       ImmutableList<String> listaInmutable = ImmutableList.copyOf(lista);
       // TODO code application logic here
       
       
       listaInmutable.stream().forEach(System.out::println);
       
	}

}
