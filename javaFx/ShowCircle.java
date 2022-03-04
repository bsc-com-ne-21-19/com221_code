import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class ShowCircle extends Application {
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new Pane();       // Create a circle and set its properties
        Circle circle = new Circle();
        
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(8);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.RED);

        pane.getChildren().add(circle); // Add circle to the pane

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }   
	public static void main(String[] args) {
        Application.launch(args);
    }
}
