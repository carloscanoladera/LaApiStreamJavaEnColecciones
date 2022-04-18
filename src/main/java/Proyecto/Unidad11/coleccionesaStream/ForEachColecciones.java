package Proyecto.Unidad11.coleccionesaStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ForEachColecciones {
	



		
	public static void main(String[] args) {
			
		List<String> listaNombre = Arrays.asList("borito", "Antonio", "Len", "Titus", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius");
		
		System.out.println("Imprimimos la lista de nombres");
		
		listaNombre.forEach(System.out::println);
		
		
		LinkedList<String> listLinked = new LinkedList<String>();
		
		listLinked.addAll(listaNombre);
		
		System.out.println("Imprimimos la lista linked de nombres");
		
		listLinked.forEach(System.out::println);
		
		
		
		
		TreeSet<String> tree = new TreeSet< String>() ;
		
		tree.addAll(listaNombre);
		System.out.println("Imprimimos una arbol de nombres");
		
		tree.forEach(System.out::println);
		
		HashSet<String> set = new HashSet< String>() ;
		
		set.addAll(listaNombre);
		
		set.forEach((e)->System.out.println(e));
		
	
		
		
		HashMap<Integer,String> map = new HashMap<Integer, String>() ;
		
		
		IntStream.range(0,listaNombre.size()).forEach(i -> map.put(i,listaNombre.get(i)));
		System.out.println("Imprimimos un Hash Map de key enteros, valores string nombres");
		
		map.entrySet().forEach((e)->System.out.println(e));
			
			
		}

	}



