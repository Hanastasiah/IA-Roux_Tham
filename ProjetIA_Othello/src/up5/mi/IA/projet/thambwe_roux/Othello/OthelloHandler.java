package up5.mi.IA.projet.thambwe_roux.Othello;

import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class OthelloHandler extends GridPane implements EventHandler<MouseEvent> {
	private int compteur;
	private GridPane pane;

	public OthelloHandler (GridPane pane) {
		this.pane = pane;
		compteur = 0;
	}

	@Override
	public void handle(MouseEvent event) {
		ImageView ivFond = new ImageView();

		if (compteur %2 ==0) {
			ivFond.setImage(new Image("/blanc.PNG"));
			Node source = (Node) event.getSource();
			int k = GridPane.getColumnIndex(source);
			int j = GridPane.getRowIndex(source);
			pane.add(ivFond, k,j);
			
			pane.getChildren().addAll(ivFond);
			compteur++;
		}
		
		else {
			ivFond.setImage(new Image("/noir.PNG"));
			Node source = (Node) event.getSource();
			int k = GridPane.getColumnIndex(source);
			int j = GridPane.getRowIndex(source);
			pane.add(ivFond, k,j);
			pane.getChildren().addAll(ivFond);
			compteur++;
		}
		
	}

}
