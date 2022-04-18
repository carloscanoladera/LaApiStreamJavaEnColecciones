package Proyecto.Unidad11.operacionesterminales;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import Proyecto.Unidad11.modelo.GeneraUsuarios;
import Proyecto.Unidad11.modelo.Usuario;

public class EjemploReduce {
	
	public static void main(String[] args) {

		Set<Usuario> setUsuarios = GeneraUsuarios.devueveUsuariosSet(100);
	
	
	Optional concatenacionNombres = setUsuarios.stream()
			.map((us)->us.getNombre())			
			.reduce((nombresCombinados, nombres)-> nombresCombinados+","+nombres );
	
	concatenacionNombres.ifPresent(System.out::println);
	
	
	
	 setUsuarios.parallelStream()
			.map((us)->us.getNombre())			
			.reduce((nombresCombinados, nombres)-> nombresCombinados+","+nombres ).
			ifPresent(System.out::println);
	
	
	}

}
