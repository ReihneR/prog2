package prog2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Frankrike extends Application{



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      
	
		
	      Rectangle rec = new Rectangle();

 
	      rec.setHeight(300);
	      rec.setWidth(200);
	      rec.setFill(Color.BLUE);
	      
	      
	      Rectangle recgul1 = new Rectangle();
	      
	      recgul1.setHeight(300);
	      recgul1.setWidth(200);
	      recgul1.setFill(Color.WHITE);
	      recgul1.setX(300);
	      
	      
	      
	      Rectangle recgul2 = new Rectangle();
	      
	      recgul2.setHeight(300);
	      recgul2.setWidth(200);
	      recgul2.setFill(Color.RED);
	      recgul2.setX(400);
	      
	      
	      
	      
	      HBox box = new HBox();

	      
	      Group root = new Group(rec, recgul1, recgul2);

	      box.getChildren().add(root);
	      
	      Scene scene = new Scene(box, 600, 300);
	     
	      primaryStage.setTitle("Drawing a France"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}

		
	}

