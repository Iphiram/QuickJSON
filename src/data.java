import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class data extends ScrollPane{
    TextArea t;
    GridPane    g;
    Label       l;

    public data() {
        //set ID for use with CSS
        setId("data");

        setPadding(new Insets(10));

        g = new GridPane();
        g.setId("lll");
        g.setPadding(new Insets(10));
        g.setVgap(10);

        l = new Label("Json Object 1");
        t = new TextArea();
        t.setWrapText(true);
        t.setPrefHeight(200);
        t.setPrefWidth(5000);

        g.add(l,0,0);
        g.add(t,0,1);

        setFitToWidth(true);
        setContent(g);
        setVbarPolicy(ScrollBarPolicy.ALWAYS);
        setHbarPolicy(ScrollBarPolicy.NEVER);


        //set Auto-sizing properties
        setMinSize(100,200);
        setPrefSize(5000,5000);
        setMaxSize(10000,10000);
    }
    public void CreateValue(GridPane g) {

    }
}
