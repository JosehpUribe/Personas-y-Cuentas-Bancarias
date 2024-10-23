package Josehp.Clases;

public class Persona {
	 private String nombre;
	 private int edad;
	 
//Constructor 
	 public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;

	 }
// Get y Set
	    public String getNombre() {
	        return nombre;
	    }
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		 public void despliegaInformacion() {
		        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
		 }
}
