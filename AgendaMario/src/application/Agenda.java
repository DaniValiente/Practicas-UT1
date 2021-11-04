package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Agenda extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {

	FXMLLoader	loader = new FXMLLoader(Agenda.class.getResource("Agenda.fxml"));
	AnchorPane root = (AnchorPane) loader.load();
	
	Scene scene = new Scene(root);
	
	stage.setScene(scene);
	stage.setTitle("Agenda de contactos");
	stage.show();
	}

	
}

