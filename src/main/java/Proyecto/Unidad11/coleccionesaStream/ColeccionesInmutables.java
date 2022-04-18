package Proyecto.Unidad11.coleccionesaStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ColeccionesInmutables {
	
	public static void main(String[] args) {
		
		
		List<String> stringList = Arrays.asList("a", "b", "c");
		stringList = Collections.unmodifiableList(stringList);
		
		stringList.forEach((s)-> System.out.print(s+","));

		Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
		stringSet = Collections.unmodifiableSet(stringSet);
		stringSet.forEach((s)-> System.out.print(s+","));

		Map<String, Integer> stringMap = new HashMap<String, Integer>(); 
		stringMap.put("a", 1); 
		stringMap.put("b", 2);
		stringMap.put("c", 3);
		stringMap = Collections.unmodifiableMap(stringMap);
		stringMap.entrySet().forEach((s)-> System.out.print(s+","));
		
		


	}

}
