package Proyecto.Unidad11.operacionesterminales;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import Proyecto.Unidad11.modelo.*;

public class EjemploOperacionesTerminales1 {
	
	public static void main(String[] args) {
		
		
		Set<Usuario> setUsuarios = GeneraUsuarios.devueveUsuariosSet(100);
		
		
		
		boolean empleadosMayor45= setUsuarios.stream().map((u)-> u.getEdad()).anyMatch((edad) -> { return  edad>45; });
		
		
		if (empleadosMayor45) {
			
			System.out.println("Hay Empleados mayores de 45 años");
			
		} 
		
		boolean todosEmpleadosMayor45= setUsuarios.stream().map((u)-> u.getEdad()).allMatch((edad) -> { return  edad>45; });


		if (!todosEmpleadosMayor45) {
			
			System.out.println("No todos los empleados son mayores de 45 años");
			
		}
		
		
		boolean ningunEmpleadosMayor45= setUsuarios.stream().map((u)-> u.getEdad()).noneMatch((edad) -> { return  edad>45; });


		if (!ningunEmpleadosMayor45) {
			
			System.out.println("Ningun empleados es mayores de 45 años");
			
		}
		
		
	}

}
