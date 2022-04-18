package Proyecto.Unidad11.optional;

import java.util.Optional;

class Empleado {
	
	int id;
	String nombre;
	
	public Empleado() {
		
		
	}
	public Empleado (int id, String nombre) {
		
		this.id=id;
		this.nombre=nombre;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString () {
		
	return "{id:"+ this.getId() + ", nombre:" + this.getNombre() + "}";
	}
	
}

public class EjemploOptional {
	
	
	public static void main(String[] args) {
	
	Optional<Empleado> empl1 = Optional.of(new Empleado(5,"Carlos Lopez"));
	Optional<Empleado> empl2 = Optional.empty();
	

	
	
	if(empl1.isPresent()){
	    Empleado emp1 = empl1.get();
	    
	    System.out.println(emp1);
	}else{
		  System.out.println("No hay nada en el Optional empl1");
	}
	
	
	if(empl2.isPresent()){
	    Empleado emp2 = empl2.get();
	    
	    System.out.println(emp2);
	}else{
		  System.out.println("No hay nada en el Optional empl2");
	}
	
	
	empl1.ifPresent(emp->System.out.println(emp));
	empl1.ifPresent(System.out::println);

}
	
}
