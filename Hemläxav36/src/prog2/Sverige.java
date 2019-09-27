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

public class Sverige extends Application implements EventHandler<ActionEvent>{

	Button knappen;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      
		knappen = new Button("Hej");
		knappen.setOnAction(this);
		
		
	      Rectangle rec = new Rectangle();

 
	      rec.setHeight(300);
	      rec.setWidth(600);
	      rec.setFill(Color.BLUE);
	      
	      
	      Rectangle recgul1 = new Rectangle();
	      
	      recgul1.setHeight(300);
	      recgul1.setWidth(58);
	      recgul1.setFill(Color.YELLOW);
	      recgul1.setX(150);
	      
	      
	      
	      Rectangle recgul2 = new Rectangle();
	      
	      recgul2.setHeight(58);
	      recgul2.setWidth(600);
	      recgul2.setFill(Color.YELLOW);
	      recgul2.setY(130);
	      
	      
	      
	      
	      HBox box = new HBox(knappen);

	      
	      Group root = new Group(rec, recgul1, recgul2);

	      box.getChildren().add(root);
	      
	      Scene scene = new Scene(box, 600, 300);
	     
	      primaryStage.setTitle("Drawing a Sweden"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == knappen)
		{
			  
		}
		
	}

}