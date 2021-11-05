package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SampleController  {
	
	@FXML
	private  Button editar;
	@FXML
	private  TextField nombre;
	@FXML
	private  TextField apellidos;
	@FXML
	private  TextField direccion;
	@FXML
	private  TextField ciudad;
	@FXML
	private  TextField codigopostal;
	@FXML
	private  DatePicker fechadenacimiento;
	@FXML
	private  TextField numerodetelefono;
	
	public void editar(ActionEvent event) { 
	nombre.setText("");
	apellidos.setText("");
	direccion.setText("");
	ciudad.setText("");
	codigopostal.setText("");
	numerodetelefono.setText("");
	
	
	}

	
	}
	

	
	


	
	

