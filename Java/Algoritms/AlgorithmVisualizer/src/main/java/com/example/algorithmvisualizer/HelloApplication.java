package com.example.algorithmvisualizer;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class HelloApplication extends Application{
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        root.getChildren().addAll(
                createNode(8, 200, 80),
                createNode(3, 120, 180),
                createNode(10, 280, 180)
        );

        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("Algorithm Visualizer");
        stage.setScene(scene);
        stage.show();
    }

    private Group createNode(int value, double x, double y) {
        Circle circle = new Circle(x, y, 30);
        circle.setFill(Color.LIGHTBLUE);
        circle.setStroke(Color.BLACK);

        Text text = new Text(String.valueOf(value));

        // Căn giữa chữ theo chiều ngang
        text.setX(x - text.getLayoutBounds().getWidth() / 2);

        // Căn giữa chữ theo chiều dọc
        text.setY(y + (text.getLayoutBounds().getHeight() / 4));

        return new Group(circle, text);
    }

    public static void main(String[] args) {
        launch(args);
    }
}