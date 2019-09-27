package prog2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Tyskland extends Application{



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      
	
		
	      Rectangle rec = new Rectangle();

 
	      rec.setHeight(100);
	      rec.setWidth(600);
	      rec.setFill(Color.BLACK);
	      
	      
	      Rectangle recgul1 = new Rectangle();
	      
	      recgul1.setHeight(100);
	      recgul1.setWidth(600);
	      recgul1.setFill(Color.RED);
	      recgul1.setY(100);
	      
	      
	      
	      Rectangle recgul2 = new Rectangle();
	      
	      recgul2.setHeight(100);
	      recgul2.setWidth(600);
	      recgul2.setFill(Color.YELLOW);
	      recgul2.setY(200);
	      
	      
	      
	      
	      HBox box = new HBox();

	      
	      Group root = new Group(rec, recgul1, recgul2);

	      box.getChildren().add(root);
	      
	      Scene scene = new Scene(box, 600, 300);
	     
	      primaryStage.setTitle("Drawing a Germanny"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}

		
	}

