package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Persona;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class controller implements Initializable{

	@FXML
	TableView<Persona> tableview;
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		TableColumn Nombre = new TableColumn("Nombre");
		TableColumn Apellidos = new TableColumn("Apellidos");
		TableColumn CB = new TableColumn("Action");
		
		tableview.getColumns().addAll(Nombre,Apellidos,CB);
		
		final ObservableList<Persona> data = FXCollections.observableArrayList(
				new Persona("Andres","Lozano", null),
				new Persona("Mario","Roman", null),
				new Persona("Daniel","Valiente", null)
				);
		
		Nombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
		Apellidos.setCellValueFactory(new PropertyValueFactory("Apellidos"));
		CB.setCellValueFactory(new PropertyValueFactory("CB"));
		
		tableview.setItems(data);
	}
	
	@FXML
	private void  EliminarFila(ActionEvent event) {
		
		
		tableview.getItems().removeAll(tableview.getSelectionModel().getSelectedItems());
		
		ObservableList<Persona> databorrar = FXCollections.observableArrayList(
				new Persona("Andres","Lozano", null),
				new Persona("Mario","Roman", null),
				new Persona("Daniel","Valiente", null)
				);
		
		for(Persona bean : databorrar) {
			
			if(bean.getCB().isSelected()) {
				
				databorrar.add(bean);
			}
			
		}
		
		databorrar.removeAll(databorrar);
		
	}
	
	
	


	
}
