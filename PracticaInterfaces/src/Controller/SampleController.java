package Controller;


import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.swing.JFormattedTextField;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class SampleController implements Initializable  {
	
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
	
	@FXML
	 public void exit(ActionEvent event) { 
		Node source = (Node) event.getSource();
	    Stage stage = (Stage) source.getScene().getWindow();
	    stage.close();
	
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fijarTextFiel(codigopostal,5,true);
		fijarTextFiel(numerodetelefono, 9,true);
		fijarTextFiel(nombre,20,false);
		fijarTextFiel(apellidos,40,false);
		fijarTextFiel(direccion,30,false);
		fijarTextFiel(ciudad,20,false);
		
	}
	
	public static void fijarTextFiel(final TextField campoTexto, final int tamanoMaximo, final Boolean numero) {
		campoTexto.lengthProperty().addListener(new ChangeListener<Number>() {

			@Override
		public void changed(ObservableValue<? extends Number> observable,
		Number valorAnterior, Number valorActual) {
		Boolean validador = true;
		if (numero) {
		try {
		Integer.parseInt(campoTexto.getText());

		} catch (NumberFormatException e) {
		if (valorActual.intValue() > valorAnterior.intValue())
		campoTexto.setText(campoTexto.getText().substring(0, valorAnterior.intValue()));
		validador = false;
		}
		}
				if(validador) {
			if (valorActual.intValue() > valorAnterior.intValue()) {
		if (campoTexto.getText().length() >= tamanoMaximo) {
		campoTexto.setText(campoTexto.getText().substring(0, tamanoMaximo));
		}
				}
						}
			}
		});
	
	
	
	
	}
}
     

	
	


	
	


	
	

