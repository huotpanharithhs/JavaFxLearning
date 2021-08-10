package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane pane = new StackPane();
        ObservableList list = pane.getChildren();
        Button btn1 = new Button("My Button1");
        Button btn2 = new Button("My Button2");
        list.addAll(btn1,btn2);
        StackPane.setMargin(btn1,new Insets(50,50,50,50));
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.setTitle("Button");
        stage.setResizable(false);
        stage.show();
    }
}
