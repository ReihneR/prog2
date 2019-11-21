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

    Button ett = new Button("1");
    Button två = new Button("2");
    Button tre = new Button("3");
    Button fyra = new Button("4");
    Button fem = new Button("5");
    Button sex = new Button("6");
    Button sju = new Button("7");
    Button åtta = new Button("8");
    Button nio = new Button("9");
    Button noll = new Button("0");

    Button addidtion = new Button("+");
    Button subtraction = new Button("-");
    Button multi = new Button("X");
    Button summa = new Button("=");
    Button clear = new Button("C");
    Button dubble = new Button(".");

    VBox mainBox;
    HBox rad1;
    HBox rad2;
    HBox rad3;
    HBox rad4;
    HBox rad0;

    @Override
    public void start(Stage primaryStage) throws Exception{


        rad0 = new HBox(fönster);
        rad2 = new HBox(ett, två, tre, subtraction);
        rad3 = new HBox(fyra, fem, sex, multi);
        rad4 = new HBox(sju, åtta, nio);
        rad1 = new HBox(noll, summa , clear, addidtion);

        noll.setOnAction(this);
        ett.setOnAction(this);
        två.setOnAction(this);
        tre.setOnAction(this);
        fyra.setOnAction(this);
        fem.setOnAction(this);
        sex.setOnAction(this);
        sju.setOnAction(this);
        åtta.setOnAction(this);
        nio.setOnAction(this);
        addidtion.setOnAction(this);
        subtraction.setOnAction(this);
        summa.setOnAction(this);
        multi.setOnAction(this);
        clear.setOnAction(this);
        mainBox = new VBox(rad0,rad4,rad3,rad2,rad1);

        primaryStage.setTitle("Miniräknare");
        primaryStage.setScene(new Scene(mainBox, 300, 300));
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
        if(actionEvent.getSource().equals(addidtion))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "+");
        }
        if(actionEvent.getSource().equals(subtraction))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "-");
        }

        if(actionEvent.getSource().equals(multi))
        {
            fönster.textProperty().set(fönster.textProperty().get() + "*");
        }
        if(actionEvent.getSource().equals(clear))
        {
            fönster.clear();
        }
        if (actionEvent.getSource() == summa){
            fönster.textProperty().set(calc()+"");
        }

    }



public double calc(){

        String op = fönster.textProperty().get();
        double summa = 0;

        if(op.contains("+")){
            String[] nummer = op.split("\\+");
            double tal1 = Double.parseDouble(nummer[0]);
            double tal2 = Double.parseDouble(nummer[1]);
            summa = tal1 + tal2;
        } else if (op.contains("-")){
            String[] nummer = op.split("\\-");
            double tal1 = Double.parseDouble(nummer[0]);
            double tal2 = Double.parseDouble(nummer[1]);
            summa = tal1 - tal2;
        } else if (op.contains("*")){
            String[] nummer = op.split("\\*");
            double tal1 = Double.parseDouble(nummer[0]);
            double tal2 = Double.parseDouble(nummer[1]);
            summa = tal1 * tal2;
        }

   return summa;
}


}

