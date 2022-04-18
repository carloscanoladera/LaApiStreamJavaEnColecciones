package Proyecto.Unidad11.operacionesterminales;

import java.util.Map;
import java.util.Optional;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;
import Proyecto.Unidad11.modelo.UsuarioNotFoundException;

public class EjemploTerminalesBusquedaOptionalYMap {
	
	
	

	public static void main(String[] args) {
		
		
		
	Map<Integer,Usuario> mapUsuarios = GeneraUsuarios.devueveUsuariosMap(100);		
		
		
		
		
		Usuario usuario = mapUsuarios.values().stream()	
				.filter((user) ->user.getEdad()>=25 && user.getEdad()<=45 )
				.findAny().map(usuariomap -> usuariomap).orElse(new Usuario());
		
		
		String nombre =  mapUsuarios.values().stream()					
				.filter( (user)-> user.getNumConexiones()> 100 )
				.findFirst()
				.map(user-> user.getNombre())
				.orElse("Usuario no encontrado");
		

		
		try {
			Usuario usuarioBusqueda = mapUsuarios.values().stream()	
					.filter((user) ->user.getEdad()>=25 && user.getEdad()<=45 )
					.findAny().map(usuariomap -> usuariomap)
					.orElseThrow(()-> new UsuarioNotFoundException("Error en la busqueda de usuario") );
		} catch (UsuarioNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
