package Model;

import javafx.scene.control.CheckBox;

public class Persona {
	private String Nombre;
    private String Apellidos;


    public Persona(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
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
}
