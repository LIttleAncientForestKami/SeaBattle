import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field extends Application {

    //Stage window;

    private int x, y;
    private boolean isEmpty;
    private Rectangle square = new Rectangle(10, 10);

    public Field(int x, int y, boolean isEmpty){
        this.x = x;
        this.y = y;
        this.isEmpty = isEmpty;

        square.setStroke(isEmpty ? Color.LIGHTGRAY : Color.BLUE);
    }

    public void start(Stage primaryBackground){

    }
}
