package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    TextField fönster = new TextField();

    Button noll = new Button("0");
    Button ett = new Button("1");
    Button två = new Button("2");
    Button tre = new Button("3");
    Button fyra = new Button("4");
    Button fem = new Button("5");
    Button sex = new Button("6");
    Button sju = new Button("7");
    Button åtta = new Button("8");
    Button nio = new Button("9");

    VBox mainBox;
    HBox rad1;
    HBox rad2;
    HBox rad3;
    HBox rad4;

    @Override
    public void start(Stage primaryStage) throws Exception{
        rad1 = new HBox(0);
        rad2 = new HBox(ett, två, tre);
        rad3 = new HBox(fyra, fem, sex);
        rad4 = new HBox(sju, åtta, nio);

        mainBox = new VBox(rad1,rad2,rad3,rad4);

        primaryStage.setTitle("Miniräknare");
        primaryStage.setScene(new Scene(mainBox, 500, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
