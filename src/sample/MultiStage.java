package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiStage extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("Button 1");
        Scene scene = new Scene(btn,100,100);
        stage.setScene(scene);
        stage.setTitle("Stage1");
        stage.show();
        Stage stage1 = new Stage();
        stage1.setTitle("Stage 2");
        Button btn2 = new Button("Button 2");
        Scene scene1 = new Scene(btn2,100,100);
        stage1.setScene(scene1);
        stage1.show();
    }
}
