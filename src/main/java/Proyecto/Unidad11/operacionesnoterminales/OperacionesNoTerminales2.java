package Proyecto.Unidad11.operacionesnoterminales;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;

import java.util.Comparator;



public class OperacionesNoTerminales2 {

	
	public static int compararPorId(Usuario us1, Usuario us2) {
		
		return us1.getId()>us2.getId()?1:(us1.getId()==us2.getId()?0:-1);
	}
	
	public static void main(String[] args) {
		List<Usuario> listaUsuarios = GeneraUsuarios.devueveUsuariosLista(100);
	
		listaUsuarios.add(listaUsuarios.get(99));
		
	System.out.println("\nPintamos la lista con un duplicado");
	listaUsuarios.stream().forEach(System.out::println);
	System.out.println("\nPintamos la lista ordenada sin duplicados");
	listaUsuarios.stream().
	distinct().	
	forEach(System.out::println);
	
	
	System.out.println("\nOrdenamos por defecto, número de conexiones");
	
	listaUsuarios.stream().
    sorted().forEach(System.out::println);
	
	System.out.println("\nOrdenamos por Nombre");
	
	Comparator<Usuario> ordenarPorNombre = (u1,u2)->u1.getNombre().compareTo(u2.getNombre());
	
    listaUsuarios.stream().
    sorted(ordenarPorNombre).forEach(System.out::println);
	
    System.out.println("\nOrdenamos por Apellido");
    
	listaUsuarios.stream().
	distinct().
	sorted((u1,u2)->u1.getApellidos().compareTo(u2.getApellidos())).forEach(System.out::println);

	 System.out.println("\nOrdenamos por id");
	
	listaUsuarios.stream().
	distinct().
	sorted(OperacionesNoTerminales2::compararPorId).forEach(System.out::println);

	
	
	System.out.println("\nPintamos el stream de la lista de usuarios limitada a 4 ordenada por Apellidos");
	listaUsuarios.stream().
	limit(4).
	sorted((u1,u2)->u1.getApellidos().compareTo(u2.getApellidos())).
	forEach(x->System.out.print(x+","));
	
	
	
	System.out.println("\nPintamos la lista , y la transformamos a un Set");
	Set <Usuario> setUsuarios=listaUsuarios.stream()
			.peek(u->System.out.print(u.getApellidos()+",")).collect(Collectors.toSet());
	
	
	}

}
