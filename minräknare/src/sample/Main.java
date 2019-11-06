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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class Main extends Application implements EventHandler<ActionEvent>{


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
    HBox rad0;
    HBox rad1;
    HBox rad2;
    HBox rad3;
    HBox rad4;
    @Override
    public void start(Stage primaryStage) throws Exception{
        rad0 = new HBox(fönster);
        rad1 = new HBox(noll);
        rad2 = new HBox(ett, två, tre);
        rad3 = new HBox(fyra, fem, sex);
        rad4 = new HBox(sju, åtta, nio);

        noll.setOnAction(this);

        mainBox = new VBox(rad0,rad1,rad2,rad3,rad4);

        primaryStage.setTitle("Miniräknare");
        primaryStage.setScene(new Scene(mainBox, 500, 550));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(noll))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "0");
        }
        if(actionEvent.getSource().equals(ett))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "1");
        }
        if(actionEvent.getSource().equals(två))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "2");
        }
        if(actionEvent.getSource().equals(tre))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "3");
        }
        if(actionEvent.getSource().equals(fyra))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "4");
        }
        if(actionEvent.getSource().equals(fem))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "5");
        }
        if(actionEvent.getSource().equals(sex))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "6");
        }
        if(actionEvent.getSource().equals(sju))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "7");
        }
        if(actionEvent.getSource().equals(åtta))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "8");
        }
        if(actionEvent.getSource().equals(nio))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "9");
        }

    }
}

