package prog2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Sverige extends Application implements EventHandler<ActionEvent> {

	static Button sverige = new Button("sverige");
	static Button frankrike = new Button("frankrike");
	static Button schewiz = new Button("schweiz");
	static Button tyskland = new Button("tyskland");
	static Stage stage;

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage  ;
		
		sverige.setOnAction(this);
		tyskland.setOnAction(this);
		frankrike.setOnAction(this);
		schewiz.setOnAction(this);
		Group knappar = new Group(frankrike, tyskland, sverige,schewiz);
		sverige.setTranslateX(100);
		frankrike.setTranslateX(0);
		schewiz.setTranslateX(200);
		tyskland.setTranslateX(300);
		Scene scene = new Scene(knappar, 600, 300);
		stage.setScene(scene);

		stage.show();
		
		
		
	}

	public static void tyskland() {
		Rectangle rec = new Rectangle();
		rec.setTranslateY(50);
		rec.setHeight(50);
		rec.setWidth(500);
		rec.setFill(Color.BLACK);

		Rectangle recgul1 = new Rectangle();
		rec.setTranslateY(50);
		recgul1.setHeight(50);
		recgul1.setWidth(500);
		recgul1.setFill(Color.RED);
		recgul1.setY(100);

		Rectangle recgul2 = new Rectangle();
		rec.setTranslateY(50);
		recgul2.setHeight(50);
		recgul2.setWidth(100);
		recgul2.setFill(Color.YELLOW);
		recgul2.setY(200);

		HBox box = new HBox();

		Group root = new Group(rec, recgul1, recgul2);

		box.getChildren().add(root);

		Scene scene = new Scene(box, 600, 300);

		stage.setTitle("Drawing a Germanny");

		stage.setScene(scene);

		stage.show();
	}

	public static void frankrike() {
		Rectangle rec = new Rectangle();
		rec.setTranslateY(50);
		rec.setHeight(300);
		rec.setWidth(200);
		rec.setFill(Color.BLUE);

		Rectangle recgul1 = new Rectangle();
		rec.setTranslateY(50);
		recgul1.setHeight(300);
		recgul1.setWidth(200);
		recgul1.setFill(Color.WHITE);
		recgul1.setX(300);

		Rectangle recgul2 = new Rectangle();
		rec.setTranslateY(50);
		recgul2.setHeight(300);
		recgul2.setWidth(200);
		recgul2.setFill(Color.RED);
		recgul2.setX(400);

		HBox box = new HBox();

		Group root = new Group(rec, recgul1, recgul2);

		box.getChildren().add(root);

		Scene scene = new Scene(box, 600, 300);

		stage.setTitle("Drawing a France");

		stage.setScene(scene);

		stage.show();
	}

	public static void schewiz() {
		Rectangle rec = new Rectangle();
		rec.setTranslateY(50);
		rec.setHeight(300);
		rec.setWidth(600);
		rec.setFill(Color.RED);

		Rectangle recgul1 = new Rectangle();
		rec.setTranslateY(50);
		recgul1.setHeight(160);
		recgul1.setWidth(50);
		recgul1.setFill(Color.WHITE);
		recgul1.setX(275);
		

		Rectangle recgul2 = new Rectangle();

		recgul2.setHeight(50);
		recgul2.setWidth(160);
		recgul2.setFill(Color.WHITE);
		rec.setTranslateY(50);
		recgul2.setX(220);

		HBox box = new HBox();

		Group root = new Group(rec, recgul1, recgul2);

		box.getChildren().add(root);

		Scene scene = new Scene(box, 600, 300);

		stage.setTitle("Drawing a Switzerland");

		stage.setScene(scene);

		stage.show();
	}

	public static void sverige() {

		Rectangle rec = new Rectangle();
		rec.setTranslateY(50);
		rec.setHeight(300);
		rec.setWidth(600);
		rec.setFill(Color.BLUE);

		Rectangle recgul1 = new Rectangle();
		rec.setTranslateY(50);
		recgul1.setHeight(300);
		recgul1.setWidth(58);
		recgul1.setFill(Color.YELLOW);
		recgul1.setX(150);

		Rectangle recgul2 = new Rectangle();
		rec.setTranslateY(50);
		recgul2.setHeight(58);
		recgul2.setWidth(600);
		recgul2.setFill(Color.YELLOW);
		

		HBox box = new HBox();

		Group root = new Group(rec, recgul1, recgul2);

		box.getChildren().add(root);

		Scene scene = new Scene(box, 600, 300);

		stage.setTitle("Drawing a Sweden");

		stage.setScene(scene);

		stage.show();
		
		
	}
	public void frankrikeknappen(Stage knapp){
		frankrike.setMinHeight(30);
		frankrike.setMinWidth(30);
		frankrike.setOnAction(this);
		
		Group knappen = new Group();
		knappen.setTranslateX(300);
		knappen.getChildren().add(frankrike);
		
		Scene scene = new Scene(knappen, 600, 500);
		knapp.setScene(scene);
		knapp.show();
		
		
		
	}
	public void schweizkanppen(Stage knapp){
		schewiz.setMinHeight(30);
		schewiz.setMinWidth(30);
		schewiz.setOnAction(this);
		
		Group knappen = new Group();
		knappen.setTranslateX(300);
		knappen.getChildren().add(schewiz);
		
		Scene scene = new Scene(knappen, 600, 500);
		knapp.setScene(scene);
		knapp.show();
		
		
		
	}
	public void sverigeknappen(Stage knapp){
		sverige.setMinHeight(30);
		sverige.setMinWidth(30);
		sverige.setOnAction(this);
		
		Group knappen = new Group();
		knappen.setTranslateX(300);
		knappen.getChildren().add(sverige);
		
		Scene scene = new Scene(knappen, 600, 500);
		knapp.setScene(scene);
		knapp.show();
		
		
		
	}
	public void tysklandknppen(Stage knapp){
		tyskland.setMinHeight(30);
		tyskland.setMinWidth(30);
		tyskland.setOnAction(this);
		
		Group knappen = new Group();
		knappen.setTranslateX(300);
		knappen.getChildren().add(tyskland);
		
		Scene scene = new Scene(knappen, 600, 500);
		knapp.setScene(scene);
		knapp.show();
		
		
		
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == sverige) {
			sverige();
		} else if (event.getSource() == tyskland) {
			tyskland();
		} else if (event.getSource() == schewiz) {
			schewiz();
		} else if (event.getSource() == sverige) {
			frankrike();
		}

	}

}