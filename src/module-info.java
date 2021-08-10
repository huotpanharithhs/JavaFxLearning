module TestJavaFx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens sample;
    opens layout_sample;
    opens testing;
}