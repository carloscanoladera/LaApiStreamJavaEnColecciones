package Proyecto.Unidad11.optional;

import java.util.Optional;

class Empleado2 {
	
	int id;
	String nombre;
	
	public Empleado2() {
		
		
	}
	public Empleado2 (int id, String nombre) {
		
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

public class EjemploOptionalMap {
	
	

	
	
	public static void main(String[] args) {
	
	Optional<Empleado2> empl1 = Optional.of(new Empleado2(5,"Carlos Lopez"));
	Optional<Empleado2> empl2 = Optional.empty();
	

	
	
	Empleado2 empleado = empl1.map(emp-> emp).orElseGet(()-> new Empleado2());
	
	try {
		Empleado2 empleado2 = empl2.map(emp->emp).orElseThrow(()-> new Exception("Empleado Optional vacio"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
