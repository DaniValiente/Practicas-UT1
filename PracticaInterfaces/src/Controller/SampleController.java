package Controller;


import javax.swing.JFormattedTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class SampleController  {
	
	@FXML
	private  Button clean;
	@FXML
	private  TextField  nombre,apellidos,direccion,ciudad,codigopostal,numerodetelefono;
	@FXML
	private  DatePicker fechadenacimiento;
	
	
	
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
     

	
	


	
	


	
	

