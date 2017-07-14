import javafx.scene.layout.Pane;


/**
 * Created by Iphiram on 7/14/2017.
 */
public class data extends Pane{
    public data() {
        //set ID for use with CSS
        setId("data");

        //set Auto-sizing properties
        setMinSize(100,200);
        setPrefSize(5000,5000);
        setMaxSize(10000,10000);
    }
}
