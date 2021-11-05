package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import application.Agenda;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Persona;
import model.PersonaTabla;

public class AnadirController implements Initializable {

	
/*	private TextField Calle;
	@FXML
	private TextField Ciudad;
	@FXML
	private TextField CodPostal;
	@FXML
	private DatePicker Fecha;
	@FXML
	private TextField Tlf;
*/

	private ObservableList<PersonaTabla> personas;

	private PersonaTabla persona;
	
	private TableView<PersonaTabla> tblPersonas;
	
		
		@FXML
		private  Button clean;
		@FXML
		private  TextField  nombre,apellidos,direccion,ciudad,codigopostal,numerodetelefono;
		@FXML
		private  DatePicker fechadenacimiento;
		
		
		@FXML
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
	
	     


    public void initAttributtes(ObservableList<PersonaTabla> personas) {
        this.personas = personas;
    }

    @FXML
    private void guardar(ActionEvent event) {

        // Cojo los datos
        String nombrE = nombre.getText();
        String apellido = apellidos.getText();

       PersonaTabla p = new PersonaTabla(nombrE,apellido);
     
       this.persona = p;

	}
    
    public PersonaTabla getPersona() {
        return persona;
    }
	
	
}
