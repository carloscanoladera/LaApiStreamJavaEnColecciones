package Proyecto.Unidad11.coleccionesaStream;

import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.stream.IntStream;

public class MapJava {
	
public static void main(String[] args) {
		
		
		List<String> listaNombre = Arrays.asList("borito", "Antonio", "Len", "Titus", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius");
		
		
		
			
		HashMap<Integer,String> map = new HashMap<Integer, String>() ;
		
	
		IntStream.range(0,listaNombre.size()).forEach(i -> map.put(i,listaNombre.get(i)));
		
		
		map.entrySet().stream().forEach((e)->System.out.println(e));
		
		
		map.compute(1, (k,v)-> v.concat(" Computado"));
		
		
		
		
		map.computeIfPresent(3, (k,v)-> v.concat(" Computado si presente"));
		
		map.entrySet().stream().forEach((e)->System.out.println(e));
		
		map.computeIfAbsent(12, v->"Gorgito");
		
		map.computeIfAbsent(14, v->"Jujito");
		
		map.entrySet().stream().forEach((e)->System.out.println(e));
		
		map.values().stream().forEach((e)->System.out.println(e));
		
		map.keySet().stream().forEach((e)->System.out.println(e));
		
		
		//Modificar la clave 2 añadiendo modificado
		
		//Danielito si no existe la clave 18
		
		
		
	}

}
