package up5.mi.IA.projet.thambwe_roux.Othello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OthelloApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		GridPane OPane = new OthelloPane();
		
		Scene scene = new Scene (OPane, 300,300);
		stage.setScene(scene);
		stage.setTitle("Othello");
		stage.show();
	}
	
	public static void main (String [] args) {
		launch(args);
		
	}
}
