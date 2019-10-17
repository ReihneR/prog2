package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane grid = new GridPane();
        grid.setHgap(100);
        grid.setVgap(100);
        grid.setPadding(new Insets(0, 10, 0, 100));
        grid.gridLinesVisibleProperty().set(true);

        HBox box = new HBox(grid);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Miniräknare");
        primaryStage.setScene(new Scene(box, 500, 550));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
