package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CiclePane extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		//circle.setStroke(Color.BLACK);
		//circle.setFill(Color.WHITE);
//		circle.setStyle("-fx-stroke: red; -fx-fill: green;");
		Color color = new Color(0.25, 0.14, 0.333, 0.51);
		circle.setFill(color);
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,200,200);
		stage.setScene(scene);
		stage.setTitle("Show Circle in Pane");
		stage.show();
	}

}
