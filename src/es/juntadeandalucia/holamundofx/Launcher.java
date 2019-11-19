package es.juntadeandalucia.holamundofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Aplicación javafx muy básica. Usamos un BorderPane como layout dada su
 * simplicidad.
 * 
 * @author pablo
 *
 */
public class Launcher extends Application {
	private Button btn;

	@Override
	public void start(Stage primaryStage) throws Exception {
		btn = new Button();
		btn.setText("Click me!");
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);

		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
