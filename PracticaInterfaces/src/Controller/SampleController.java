package Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class SampleController  {
	
	@FXML
	private  Button clean;
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
     

	
	


	
	


	
	

