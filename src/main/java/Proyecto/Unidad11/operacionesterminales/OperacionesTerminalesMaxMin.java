package Proyecto.Unidad11.operacionesterminales;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import Proyecto.Unidad11.modelo.*;
public class OperacionesTerminalesMaxMin {
	
	
	public static int usuarioMasHoras(Usuario u1, Usuario u2) {
		
		
		return u1.getHorasDeUso()>u2.getHorasDeUso()?1:( u1.getHorasDeUso()>u2.getHorasDeUso()?0:-1);
	}

	public static void main(String[] args) {
		List<Usuario> listaUsuarios = GeneraUsuarios.devueveUsuariosLista(100);
		
		System.out.println("\nPintamos la lista");
		listaUsuarios.forEach(u->System.out.print(u+","));
		
		Optional<Usuario> usuario = listaUsuarios.stream().min((u1,u2)-> u1.compareTo(u2));
		
		System.out.println ("\nUsuario con el numero Minimo de conexiones: "+ usuario.get());
		
		 listaUsuarios.
				stream().
				max((u1,u2)-> u1.getApellidos().compareTo(u2.getApellidos())).		
		ifPresent((us)->System.out.println ("El ultimo usuario en orden alfabetico por apellidos "+ us));
	
	
	
		 listaUsuarios.
			stream().
			min( OperacionesTerminalesMaxMin::usuarioMasHoras).		
	ifPresent((us)->System.out.println ("El usuario con menos horas en el sistema "+ us));
	
	}
	
	
	
	
}
