package layout_sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBoxSample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());
        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    private HBox getHBox() {
        HBox hBox = new HBox();
        hBox.setStyle("-fx-background-color: gray");
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.getChildren().add(new Label("Hello   "));
        hBox.getChildren().add(new Label("Hello   "));
        hBox.getChildren().add(new ImageView("ic_cam_flag.png"));
        return hBox;
    }

    private VBox getVBox() {
        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: blue");
        vBox.setPadding(new Insets(10, 10, 10, 10));
        Label[] labels = {new Label("TVET PP"), new Label("TVET KPC"), new Label("TVET BAB")};
        for (Label label : labels) {
            VBox.setMargin(label, new Insets(10, 10, 10, 10));
            vBox.getChildren().add(label);
        }
        return vBox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
