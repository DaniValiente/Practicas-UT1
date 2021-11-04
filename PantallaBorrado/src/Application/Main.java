package Application;

import Model.Persona;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
	    launch(args);
	  }


	public void start(Stage primaryStage) {

		primaryStage.setScene(new Scene(CreateContent(), 500, 500));
		
		primaryStage.setTitle("Eliminar");

	    primaryStage.show();
	    
	  }


	private Parent CreateContent() {
		
		AnchorPane anchorpane = new AnchorPane();
		
		TableView<Persona> tableview = new TableView();

	    TableColumn<Persona, String> column1 = new TableColumn<>("Nombre");
	    column1.setCellValueFactory(new PropertyValueFactory<>("Nombre"));

	    TableColumn<Persona, String> column2 = new TableColumn<>("Apellidos");
	    column2.setCellValueFactory(new PropertyValueFactory<>("Apellidos"));
	    


	    tableview.getColumns().add(column1);
	    tableview.getColumns().add(column2);

		tableview.getItems().add(new Persona("Paco", "Gomez"));
	    tableview.getItems().add(new Persona("Jane", "Deer"));
	    
	    AnchorPane.setLeftAnchor(tableview, 30.0);
	    AnchorPane.setTopAnchor(tableview, 50.0);
	    

	    Button eliminar = new Button("Eliminar");
	    AnchorPane.setTopAnchor(eliminar, 350.0);
	    AnchorPane.setRightAnchor(eliminar, 50.0);
	    
	    
	    anchorpane.getChildren().addAll(tableview);
	    anchorpane.getChildren().addAll(eliminar);

	    

		return anchorpane;
	}
}
