import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class FXHelloWorld extends Application {

	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene

        //scene_graph

		Button btn = new Button("Hello world");
        Button btn2 = new Button("I LV PM");
		StackPane root = new StackPane();
		root.getChildren().add(btn);
        root.getChildren().add(btn2);

        //scene

		Scene scene = new Scene(root, 300, 250);

        //stage

		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
    //use to launch start
}
