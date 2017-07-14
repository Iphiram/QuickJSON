import javafx.scene.layout.FlowPane;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class value extends FlowPane {
    public value() {
        //set ID for use with CSS
        setId("value");

        //set Auto-sizing properties
        setMinSize(100,200);
        setPrefSize(5000,5000);
        setMaxSize(10000,10000);
    }
}
