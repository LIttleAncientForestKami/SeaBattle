import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;

public class Background extends Application{

    Stage window;
    Field square = new Field(8, 8, true);
    Rectangle[][] grid = new Rectangle[10][10];

    public void start(Stage primaryBackground){

        window = primaryBackground;
        window.setTitle("Battleships Game");

        Pane background = new Pane();
        background.setPrefSize(800,800);

        for(int i = 0; i < 10; i++){
            Rectangle square = new Field(8,8, true);
        }

        Label nameLabel1 = new Label("Enemy");
        GridPane.setConstraints(nameLabel1, 75, 0);

        Label nameLabel2 = new Label("You");
        GridPane.setConstraints(nameLabel2, 75, 85);

        background.getChildren().addAll(nameLabel1, nameLabel2);

        Scene scene = new Scene(background);

        window.setScene(scene);
        window.show();

    }

    public static void main(String args[]){

        launch(args);

    }
}
