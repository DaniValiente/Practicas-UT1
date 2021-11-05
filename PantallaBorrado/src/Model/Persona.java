package Model;

import javafx.scene.control.CheckBox;

public class Persona {
	private String Nombre;
    private String Apellidos;
    private CheckBox CB;


    public Persona(String Nombre, String Apellidos, CheckBox CB) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.CB = new CheckBox();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String lastName) {
        this.Apellidos = lastName;
    }

	public CheckBox getCB() {
		return CB;
	}

	public void setCB(CheckBox CB) {
		this.CB = CB;
	}
}
