package controller;

import java.io.IOException;

import application.Agenda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AgendaController {

	@FXML
	private Button Añadir;
	@FXML
	private Button Borrar;
	@FXML
	private Button Editar;
	
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
	
	private void add(ActionEvent event) throws IOException {
		ventana();
	}
	
	public void ventana() throws IOException {
		Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Añadir.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
	
        }catch (IOException e) {
        e.printStackTrace();
    }
	

	}
}
