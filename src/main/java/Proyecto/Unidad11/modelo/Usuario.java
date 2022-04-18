package Proyecto.Unidad11.modelo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Usuario implements Comparable {
	private int id;
	private String nombre;
	private String apellidos;
	private Integer Edad;
	private Double horasDeUso;
	private int numConexiones;
	
	
	
	public Usuario(int id, String nombre, String apellidos, Integer edad, Double horasDeUso, int numConexiones) {
	
		this.id=id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Edad = edad;
		this.horasDeUso = horasDeUso;
		this.numConexiones = numConexiones;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public Integer getEdad() {
		return Edad;
	}
	public Double getHorasDeUso() {
		return horasDeUso;
	}
	public int getNumConexiones() {
		return numConexiones;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public void setHorasDeUso(Double horasDeUso) {
		this.horasDeUso = horasDeUso;
	}
	public void setNumConexiones(int numConexiones) {
		this.numConexiones = numConexiones;
	}
	
	
	


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Edad=" + Edad
				+ ", horasDeUso=" + horasDeUso + ", numConexiones=" + numConexiones + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Usuario u2= (Usuario) o;
		return this.getNumConexiones()>u2.getNumConexiones()?1:(this.getNumConexiones()==u2.getNumConexiones()?0:-1);
	}



		
		
		

}
