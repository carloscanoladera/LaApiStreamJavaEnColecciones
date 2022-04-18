package Proyecto.Unidad11.operacionesnoterminales;


	
	
	import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



		class EmpleadoArrayToInt {
			
			int id;
			String nombre;
			private int index = 0;
			
			public EmpleadoArrayToInt (int id, String nombre) {
				
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
		
		public class MapToIntEmpleados {
			
			  public static final List<String>  lista = (List<String>) Arrays.asList("ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
			            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
			            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL");
		  public static int index=0;
		
		public MapToIntEmpleados() {
			
			
			
		}
		
		
		public static void main(String[] args) {
			
			index=0;
			
			 List<Empleado> empleadosLista = 
					 lista.stream().map((nombre) -> (Empleado) new Empleado(lista.indexOf(nombre),nombre)).collect(Collectors.toList());
		
			
			System.out.println("Mapeamos el array de objetos a un IntStream");
			empleadosLista.stream().mapToInt((e)-> e.getId()).forEach((id) -> System.out.println(id));
			 
			}

}
