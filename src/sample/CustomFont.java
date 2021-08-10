package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CustomFont extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text("ហួត បញ្ញាឫទ្ធិ");
        String url = getClass().getResource("KhmerOSMoulLight.ttf").toExternalForm();
        Font font = Font.loadFont(url, 40);
        System.out.println(font);
        text.setFont(font);

        StackPane pane = new StackPane();
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 595, 150);
        stage.setTitle("Custom Font");
        stage.setScene(scene);
        stage.show();
    }
}
