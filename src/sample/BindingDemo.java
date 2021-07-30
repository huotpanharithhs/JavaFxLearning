package sample;

import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {
    public static void main(String[] args) {
        SimpleDoubleProperty d1 = new SimpleDoubleProperty(1);
        SimpleDoubleProperty d2 = new SimpleDoubleProperty(2);
        System.out.println(d1.getValue() + " " + d2.getValue());
        d1.bind(d2);
        System.out.println(d1.getValue() + " " + d2.getValue());
        d2.setValue(5.2);
        System.out.println(d1.getValue() + " " + d2.getValue());
    }
}
