package model;

public class Persona {

	private String Nombre;
	private String Apellido;
	private String Calle;
	private String Ciudad;
	private String CodigoP;
	private String Fecha;
	private String Tlf;
	
	public Persona(){
		
	}
	
	Persona(String n, String a, String ca, String ci,String Cp,String f,String tlf){
		this.Nombre=n;
		this.Apellido=a;
		this.Calle=ca;
		this.Ciudad=ci;
		this.Fecha=f;
		this.CodigoP=Cp;
		this.Tlf=tlf;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public void setCodigoP(String codigoP) {
		CodigoP = codigoP;
	}
	public void setTlf(String tlf) {
		Tlf = tlf;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public String getCalle() {
		return Calle;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public String getFecha() {
		return Fecha;
	}
	public String getCodigoP() {
		return CodigoP;
	}
	public String getTlf() {
		return Tlf;
	}
}
