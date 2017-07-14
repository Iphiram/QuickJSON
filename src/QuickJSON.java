import javafx.application.Application;
import javafx.stage.Stage;import javafx.scene.Scene;

/**
 * Created by Josh Gorman on 7/14/2017.
 */
public class QuickJSON extends Application {
    public void start(Stage primaryStage) {
        JSONmodel model = new JSONmodel();
        JSONview view = new JSONview(model);

        Scene s = new Scene(view, 800,600);
        s.getStylesheets().add("Style.css");
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(400);

        primaryStage.setTitle("QuickJSON");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
