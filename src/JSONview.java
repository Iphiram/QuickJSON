import javafx.scene.layout.GridPane;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class JSONview extends GridPane{
    private JSONmodel       model;
    private data             da;
    private value            va;
    private hbox             hb;

    public JSONview(JSONmodel m) {
        //set ID for use with CSS
        setId("JSONview");

        //set for auto-sizing
        setPrefSize(1000,1000);

        //Initialize model and view classes for organization
        model = m;
        da = new data();
        va = new value();
        hb = new hbox();

        //add view classes to gridpane
        add(da, 0,0);
        add(va, 1, 0);
        add(hb, 0,1,2,1);
    }
}
