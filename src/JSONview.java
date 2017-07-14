import javafx.scene.layout.GridPane;

/**
 * Created by Josh Gorman on 7/14/2017.
 */
public class JSONview extends GridPane{
    private JSONmodel       model;
    private data             da;
    private value            va;
    private hbox             hb;

    public JSONview(JSONmodel m) {
        setId("JSONview");
        setPrefSize(1000,1000);

        model = m;
        da = new data();
        va = new value();
        hb = new hbox();

        add(da, 0,0);
        add(va, 1, 0);
        add(hb, 0,1,2,1);
    }
}
