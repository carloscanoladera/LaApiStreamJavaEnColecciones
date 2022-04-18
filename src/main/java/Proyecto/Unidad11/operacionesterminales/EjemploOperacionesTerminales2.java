package Proyecto.Unidad11.operacionesterminales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;

public class EjemploOperacionesTerminales2 {
	
	
	public static void main(String[] args) {
	
		Set<Usuario> setUsuarios = GeneraUsuarios.devueveUsuariosSet(100);
		
		
	
	
	long numUsuarios = setUsuarios
	.stream()
	.count();
	
	
	
	System.out.println("El número de usuarios en el array es: " + numUsuarios);
	

			
			
	long numApellidos = setUsuarios
	.stream()
	.map( (u) -> u.getApellidos())
	.flatMap((apellidoIndividual) -> {
	    String[] apellidos = apellidoIndividual.split(" ");
	    return (Stream<String>) Arrays.stream(apellidos);
	})
	.peek((apellidoIndividual)->System.out.print(apellidoIndividual+ ","))
	.count();
	
	System.out.println("\n El número de apellidos en la lista es: " + numApellidos);
	}

}
