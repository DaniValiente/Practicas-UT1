package model;

public class PersonaTabla {
	
	private String Nombre;
	private String Apellido;
	
	public PersonaTabla(){
		
	}
	
	public PersonaTabla(String n, String a){
		this.Nombre=n;
		this.Apellido=a;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
}
