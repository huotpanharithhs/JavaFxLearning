package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ImageViewClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new HBox();
        pane.setPadding(new Insets(10, 10, 100, 10));
//		Image img = new Image("flag.png");
//		ImageView imageView = new ImageView(img);
        ImageView imageView = new ImageView("ic_cam_flag.png");
        ImageView imageView1 = new ImageView("ic_cam_flag.png");
        imageView1.setRotate(90);
        ImageView imageView2 = new ImageView("ic_cam_flag.png");
        pane.getChildren().addAll(imageView, imageView1, imageView2);
        Scene s = new Scene(pane, 600, 200);
        stage.setScene(s);
        stage.show();
    }

}
