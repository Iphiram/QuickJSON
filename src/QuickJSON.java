import javafx.application.Application;
import javafx.stage.Stage;import javafx.scene.Scene;

/**
 * Created by Josh Gorman on 7/14/2017.
 */
public class QuickJSON extends Application {
    public void start(Stage primaryStage) {
        JSONcontroller controller = new JSONcontroller();
        JSONmodel model = new JSONmodel();

        JSONview view = new JSONview();
        Scene s = new Scene(view, 800,600);

        primaryStage.setScene(s);
        primaryStage.setTitle("QuickJSON");
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
