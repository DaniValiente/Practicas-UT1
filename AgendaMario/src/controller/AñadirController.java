package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A�adirController {

	@FXML
	private Button A�adir;
	@FXML 
	private Text Nombre;
	@FXML
	private Text Apellido;
	@FXML
	private Text Calle;
	@FXML
	private Text Ciudad;
	@FXML
	private Text CodPostal;
	@FXML
	private Text Fecha;
	@FXML
	private Text Tlf;
	
	private void ense�ar(ActionEvent event) throws IOException {
		FXMLLoader	loader1 = new FXMLLoader(getClass().getResource("A�adir.fxml"));
		AnchorPane root1 = (AnchorPane)loader1.load();
		Stage stage= new Stage();
		stage.setScene(new Scene(root1));
	}
}
