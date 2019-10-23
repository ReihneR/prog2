package sample;
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    GridPane grid = new GridPane();

    char[] knappar = {'0','1','2','3','4','5','6','7','8','9'};

    @Override
    public void start(Stage primaryStage) throws Exception{


        grid.setHgap(100);
        grid.setVgap(100);
        grid.setPadding(new Insets(0, 10, 0, 0));
        grid.gridLinesVisibleProperty().set(true);



        HBox box = new HBox(grid);


        primaryStage.setTitle("Miniräknare");
        primaryStage.setScene(new Scene(box, 500, 550));
        primaryStage.show();
    }

    public void knapparPlats(){
        int buttonPlats = 0;
        for(int rad = 0; rad <5; rad++) {
            for(int column = 0; column < 3; column++) {
                //grid.add(knappar.get(buttonPlats), column, rad);
                buttonPlats++;
                //if(buttonPlats == knappar.size())
                break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
