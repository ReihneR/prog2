package prog2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Schewiz extends Application{



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      
	
	      Rectangle rec = new Rectangle();

	      
	      rec.setHeight(300);
	      rec.setWidth(600);
	      rec.setFill(Color.RED);
	      
	      
	      Rectangle recgul1 = new Rectangle();
	      
	      recgul1.setHeight(160);
	      recgul1.setWidth(50);
	      recgul1.setFill(Color.WHITE);
	      recgul1.setX(275);
	      recgul1.setY(80);
	      
	      
	      
	      Rectangle recgul2 = new Rectangle();
	      
	      recgul2.setHeight(50);
	      recgul2.setWidth(160);
	      recgul2.setFill(Color.WHITE);
	      recgul2.setY(130);
	      recgul2.setX(220);  
	      
	      
	      
	      
	      
	      HBox box = new HBox();

	      
	      Group root = new Group(rec, recgul1, recgul2);

	      box.getChildren().add(root);
	      
	      Scene scene = new Scene(box, 600, 300);
	     
	      primaryStage.setTitle("Drawing a Switzerland"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}

		
	}

