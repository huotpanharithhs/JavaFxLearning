package layout_sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPaneSample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setLeft(new CustomPane("Left"));
        pane.setRight(new CustomPane("Right"));
        pane.setTop(new CustomPane("Top"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setCenter(new CustomPane("Center"));
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}

class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(10, 10, 10, 10));
    }
}