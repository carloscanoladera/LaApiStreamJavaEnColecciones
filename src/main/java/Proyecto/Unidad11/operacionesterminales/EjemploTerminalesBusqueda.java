package Proyecto.Unidad11.operacionesterminales;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;

public class EjemploTerminalesBusqueda {
	
	public static void main(String[] args) {
		
		Map<Integer,Usuario> mapUsuarios = GeneraUsuarios.devueveUsuariosMap(100);		
		
		
		
		
		Optional nombre = mapUsuarios.values().stream()		
				
				.filter((usuario) ->usuario.getEdad()>=25 && usuario.getEdad()<=45 )
				.findAny();
		
		if (nombre.isPresent()) {
			
			
			System.out.println("Encontramos usuarios cuya edad esta entre 25 y 45" + nombre.get());
		} else {
			
			System.out.println("Encontramos usuarios cuya edad esta entre 25 y 45" );
		} 
		
		Optional nombre2 =  mapUsuarios.values().stream()					
				.filter( (usuario)-> usuario.getNumConexiones()> 100 )
				.findFirst();
		
		nombre2.ifPresent( s->	
			System.out.println("Encontramos un usuario con numero de conexiones mayor que 100 " + s));
		
		
		
		Optional nombre3=  mapUsuarios.values().stream()					
				.filter( (usuario)-> usuario.getNombre().toLowerCase().startsWith("a"))
				.findAny();
						
		if (nombre3.isPresent()) {

			System.out.println("encontramos un usuario cuyo nombre empieza por a" + nombre.get());
		} else {

			System.out.println("no encontramos un usuario  cuyo nombre empiezan por a");
		}
				
		
	}

}
