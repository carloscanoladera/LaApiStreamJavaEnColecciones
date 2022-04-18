package Proyecto.Unidad11.modelo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainUsuario {
	
	
	public static void main(String[] args) {
		
		System.out.println("Generamos lista");
		
		List<Usuario> lista = GeneraUsuarios.devueveUsuariosLista(100);
		
		lista.stream().forEach((u)-> System.out.println(u));
		
		
		
		// Contar los usuarios jubilados
		
		
		Long contandoJubilados =lista.stream().filter(u->u.getEdad()>65).collect(Collectors.counting());
		
		System.out.println("Contamos jubilados: " + contandoJubilados);
		
		
		Usuario jubilado = lista.stream()
								.filter(u->u.getEdad()>65)
								.collect(Collectors.maxBy((u1,u2)->u1.getNombre().compareTo(u2.getNombre()))).get();
		
		System.out.println("imprimimos jubilado nombre mayor: " + jubilado);
		
		
		Usuario jubiladoMayorEdad =  lista.stream()
				.filter(u->u.getEdad()>65)
				.collect(Collectors.maxBy((u1,u2)-> u1.getEdad()>u2.getEdad()?1:(u1.getEdad()==u2.getEdad()?0:-1))).get();
		
				System.out.println("imprimimos jubilado de mayor edad: " + jubiladoMayorEdad);
		
		
				
		Double MediaEdadUsuarios = lista.stream().collect(Collectors.averagingDouble(u->u.getEdad()));
		
		
		System.out.println("Media de edad usuarios: " + MediaEdadUsuarios);
		
		
		//agrupar por edad
		
		Map<Integer, List<Usuario>> mapAgrupadoEdad = lista.stream().collect(Collectors.groupingBy(u-> u.getEdad()));
		
		mapAgrupadoEdad.entrySet().forEach(e->System.out.println(" clave: " + e.getKey() + " lista: " + e.getValue()));
		
		
		// Particiona por jubilados
		
		
		Map<Boolean, List<Usuario>> mapParticionJubilados = lista.stream().collect(Collectors.partitioningBy(u->u.getEdad()>65 ));
		
		mapParticionJubilados.entrySet().forEach(e->System.out.println(" clave: " + e.getKey() + " lista: " + e.getValue()));

		
		
		System.out.println("Generamos set");
		
		Set<Usuario> setUsuarios = GeneraUsuarios.devueveUsuariosSet(100);
		
		setUsuarios.parallelStream().forEach(System.out::println);
		
		
		System.out.println("Generamos map");	
		
		
		Map<Integer,Usuario> mapUsuarios = GeneraUsuarios.devueveUsuariosMap(50);
	
		
		System.out.println("Usuarios map");	
		mapUsuarios.values().stream().forEach(System.out::println);
		
		
		System.out.println("Claves map");	
		mapUsuarios.keySet().stream().forEach(System.out::println);
	}

}
