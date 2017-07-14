import javafx.application.Application;
import javafx.stage.Stage;import javafx.scene.Scene;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class QuickJSON extends Application {
    public void start(Stage primaryStage) {
        //create model to pass to view and to be updated from the controller
        JSONmodel model = new JSONmodel();
        JSONview view = new JSONview(model);

        //set scene properties
        Scene s = new Scene(view, 800,600);
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(400);

        //load stylesheet, title, view and show scene
        s.getStylesheets().add("Style.css");
        primaryStage.setTitle("QuickJSON");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
