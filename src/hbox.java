import javafx.scene.layout.HBox;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class hbox extends HBox {
    public hbox () {
        //set ID for use with CSS
        setId("hbox");

        //set Auto-sizing properties
        setMinSize(100,50);
        setPrefSize(5000,50);
        setMaxSize(10000,10000);
    }
}
