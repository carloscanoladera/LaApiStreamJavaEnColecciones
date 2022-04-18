package Proyecto.Unidad11.operacionesnoterminales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;

public class OperacionesNoTerminales {

	public static void main(String[] args) {

		
	
		List<Usuario> listaUsuarios = GeneraUsuarios.devueveUsuariosLista(100);
		
		System.out.println("Lista de usuarios:");
		
		listaUsuarios.forEach(System.out::println);
		
		System.out.println("Lista de nombre de usuarios empiecen por a b o s");
		
		listaUsuarios
		.stream()
		.map(u->u.getNombre()) 
		.map(String::toLowerCase) 
		.filter(n -> n.startsWith("a") ||n.startsWith("b") || n.startsWith("s") )
		.forEach(System.out::println);
		
		
		System.out.println("Lista de usuarios con edad mayor que 30:");
		
		listaUsuarios
		.stream()		
		.filter(u -> u.getEdad()> 30 )
		.forEach(System.out::println);		
		
		
		
		
		listaUsuarios
		.stream()
		.map(u->u.getNombre() + " " + u.getApellidos())
		.flatMap((nombreAp) -> {
			List<String> NombreYApellidos = new ArrayList<String>();
		    NombreYApellidos.add(nombreAp);
		    
		    return (Stream<String>) NombreYApellidos.stream();
		})
		.forEach((nombreAp) -> System.out.print(nombreAp+","));
		
		
		
			
	}

}
