package Controller;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class SampleController  {
	
	@FXML
	private  Button clean;
	@FXML
	private  TextField nombre, apellidos,direccion,ciudad,codigopostal,numerodetelefono;
	@FXML
	private  DatePicker fechadenacimiento;
	
	@FXML 
	private void eventKey(KeyEvent ev) {
		Object evt =ev.getSource();
		if(codigopostal.getText().length()>5) {
			ev.consume();
		}
	}
	
	
	
	
	public void clean(ActionEvent event) { 
	nombre.setText("");
	nombre.requestFocus();
	apellidos.setText("");
	direccion.setText("");
	ciudad.setText("");
	codigopostal.setText("");
	numerodetelefono.setText("");
	fechadenacimiento.getEditor().clear();
	
	}
	
}
     

	
	


	
	


	
	

