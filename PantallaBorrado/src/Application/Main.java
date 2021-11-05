package Application;

import java.io.IOException;

import Model.Persona;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
	    launch(args);
	  }


	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Sample.fxml"));
		AnchorPane anchorpane =  (AnchorPane) loader.load();
		
		Scene scene = new Scene(anchorpane);
		primaryStage.setScene(scene);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Eliminar");

	    primaryStage.show();
	    
	  }



	
	
}

