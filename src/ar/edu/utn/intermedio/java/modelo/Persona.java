package ar.edu.utn.intermedio.java.modelo;

public class Persona {
	
	public String nombre;
	public String apellido;
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void identificarse() {
		//forma1 (usar esta)
		System.out.println(String.format("%s %s", nombre, apellido));
		
		//forma2
		//System.out.println(this.nombre + " " + this.apellido);
		
		//forma3
//		String mensaje = this.nombre + " " + this.apellido;
//		System.out.println(mensaje);
	}

}
