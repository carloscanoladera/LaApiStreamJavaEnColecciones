package Proyecto.Unidad11.modelo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneraUsuarios {
	
public static List<Usuario> devueveUsuariosLista(int numUsuarios) {
		
		
		
		return IntStream
		.range(0, numUsuarios)
		.mapToObj(
			i-> new Usuario(i, 
					GeneraCamposAleatorios.getNombreAleatorio(),
					GeneraCamposAleatorios.getApellidosAleatorio(),
					GeneraCamposAleatorios.getEdad(),
					GeneraCamposAleatorios.getHoras(),
					GeneraCamposAleatorios.numConexiones())
			
				).collect(Collectors.toList());
		
		
	}
	
public static Set<Usuario> devueveUsuariosSet(int numUsuarios) {
		
		
		
		return IntStream
		.range(0, numUsuarios)
		.mapToObj(
			i-> new Usuario(i, 
					GeneraCamposAleatorios.getNombreAleatorio(),
					GeneraCamposAleatorios.getApellidosAleatorio(),
					GeneraCamposAleatorios.getEdad(),
					GeneraCamposAleatorios.getHoras(),
					GeneraCamposAleatorios.numConexiones())
			
				).collect(Collectors.toCollection(TreeSet::new));
		
		
	}
	
	
public static Map<Integer,Usuario> devueveUsuariosMap(int numUsuarios) {
		
	
		
		return   IntStream
		.range(0, numUsuarios)
		.mapToObj(
			i-> new Usuario(i, 
					GeneraCamposAleatorios.getNombreAleatorio(),
					GeneraCamposAleatorios.getApellidosAleatorio(),
					GeneraCamposAleatorios.getEdad(),
					GeneraCamposAleatorios.getHoras(),
					GeneraCamposAleatorios.numConexiones())
			
				).collect(Collectors.toMap(u->u.getId(),Function.identity()));
		
	
	}
	
// Clave va a ser nombre y apellidos separado por un espacio

public static Map<String,Usuario> devueveUsuariosMapClaveString(int numUsuarios) {
	
	
	
	return   IntStream
	.range(0, numUsuarios)
	.mapToObj(
		i-> new Usuario(i, 
				GeneraCamposAleatorios.getNombreAleatorio(),
				GeneraCamposAleatorios.getApellidosAleatorio(),
				GeneraCamposAleatorios.getEdad(),
				GeneraCamposAleatorios.getHoras(),
				GeneraCamposAleatorios.numConexiones())
		
			).collect(Collectors.toMap(u->u.getNombre()+ " " + u.getApellidos(),u-> u));
	

}



}
