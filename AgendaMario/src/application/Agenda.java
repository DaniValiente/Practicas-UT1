package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Persona;
import model.PersonaTabla;

public class Agenda extends Application {

	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {

	FXMLLoader	loader = new FXMLLoader(getClass().getResource("Agenda.fxml"));
	AnchorPane root = (AnchorPane) loader.load();
	 
	Scene scene = new Scene(root);
	
	stage.setScene(scene);
	stage.setTitle("Agenda de contactos");
	stage.show();
	}

	
}

