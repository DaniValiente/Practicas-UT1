package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Agenda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.PersonaTabla;
import model.Persona;


public class AgendaController implements Initializable {

	@FXML
	private Button Añadir;
	@FXML
	private Button Borrar;
	@FXML
	private Button Editar;
	 	@FXML
	    private TableView<PersonaTabla> tblPersonas;
	    @FXML
	    private ObservableList<PersonaTabla> personas;
	@FXML 
	private Label Nombre;
	@FXML
	private Label Apellido;
	@FXML
	private Label Calle;
	@FXML
	private Label Ciudad;
	@FXML
	private Label CodPostal;
	@FXML
	private Label Fecha;
	@FXML
	private Label Tlf;
	
	@FXML
	private void add(ActionEvent event) throws IOException {
			
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Añadir.fxml"));
         AnchorPane root1 = (AnchorPane) loader.load();
         Stage stage = new Stage();
         stage.setTitle("Añadir");
         stage.setScene(new Scene(root1));
         stage.show();
         
         AnadirController controlador = loader.getController();
         controlador.initAttributtes(personas);
         
         PersonaTabla p = controlador.getPersona();
         if (p != null) {

             // AÃ±ado la persona
             this.personas.add(p);

             // Refresco la tabla
             this.tblPersonas.refresh();
         }
         
         
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		TableColumn<PersonaTabla,String> Nombre = new TableColumn<PersonaTabla,String>("Nombre");
		TableColumn<PersonaTabla,String> Apellido = new TableColumn<PersonaTabla, String>("Apellido");
		
		tblPersonas.getColumns().addAll(Nombre,Apellido);

		personas = FXCollections.observableArrayList(
				new PersonaTabla("Mario","Roman"),
				new PersonaTabla("Daniel", "Valiente"),
				new PersonaTabla("Andres","Lozano"));
		
		Nombre.setCellValueFactory(new PropertyValueFactory<PersonaTabla,String>("Nombre"));
		Apellido.setCellValueFactory(new PropertyValueFactory<PersonaTabla,String>("Apellido"));
	
		tblPersonas.setItems(personas);
		
		
	}
	
	@FXML
	private void borrar(ActionEvent event) {

	tblPersonas.getItems().removeAll(tblPersonas.getSelectionModel().getSelectedItems());

	}
	
	
}

