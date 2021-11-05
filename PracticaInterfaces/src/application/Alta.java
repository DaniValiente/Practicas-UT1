package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Alta extends Application {



public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage stage) throws Exception {



FXMLLoader loader = new FXMLLoader(Alta.class.getResource("NuevoUsuario.fxml"));
AnchorPane root = (AnchorPane) loader.load();

Scene scene = new Scene(root);
stage.setScene(scene);
stage.setTitle("Alta Usuario");
stage.show();
}




}