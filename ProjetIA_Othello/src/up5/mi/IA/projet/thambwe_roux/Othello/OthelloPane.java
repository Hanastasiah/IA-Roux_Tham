package up5.mi.IA.projet.thambwe_roux.Othello;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class OthelloPane extends GridPane {

	public OthelloPane() {
		Compteur compteur = new Compteur();
		GridPane pane = new GridPane();

		for (int i=0; i<36; i++) {
			if (i/6 == 2 && i%6 == 2 || i/6 == 3 && i%6 == 3) { // CREATION PION NOIR
				Image iNoir = new Image("/noir.PNG");
				ImageView ivNoir = new ImageView();

				ivNoir.setImage(iNoir);
				ivNoir.setFitWidth(50);
				ivNoir.setPreserveRatio(true);

				pane.add(ivNoir, i/6, i%6);
				this.getChildren().add(ivNoir);
			}
			else if (i/6 == 2 && i%6 == 3 || i/6 == 3 && i%6 == 2) { // CREATION PION BLANC
				Image iBlanc = new Image("/blanc.PNG");
				ImageView ivBlanc = new ImageView();

				ivBlanc.setImage(iBlanc);
				ivBlanc.setFitWidth(50);
				ivBlanc.setPreserveRatio(true);

				pane.add(ivBlanc, i/6, i%6);
				this.getChildren().add(ivBlanc);
			}
			else { // CREATION FOND
				Image iFond = new Image("/fond.PNG");
				ImageView ivFond = new ImageView();

				ivFond.setImage(iFond);
				ivFond.setFitWidth(50);
				ivFond.setPreserveRatio(true);

				pane.add(ivFond, i/6, i%6);

				/*ivFond.setOnMouseClicked ((event)-> {
					if (compteur.getCompteur() %2 ==0) {
						ivFond.setImage(new Image("/blanc.PNG"));
						Node source = (Node) event.getSource();
						int k = GridPane.getColumnIndex(source);
						int j = GridPane.getRowIndex(source);
						pane.add(ivFond, k,j);
						this.getChildren().add(ivFond);
						compteur.setCompteur(compteur.getCompteur()+1);
					}
					else {
						ivFond.setImage(new Image("/noir.PNG"));
						Node source = (Node) event.getSource();
						int k = GridPane.getColumnIndex(source);
						int j = GridPane.getRowIndex(source);
						pane.add(ivFond, k,j);
						this.getChildren().add(ivFond);
						compteur.setCompteur(compteur.getCompteur()+1);
					}
				});*/
				
				ivFond.setOnMouseClicked (new OthelloHandler(pane));

				this.getChildren().add(ivFond);
			}
		}


	}
}
