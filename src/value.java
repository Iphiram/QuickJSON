import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextAlignment;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class value extends AnchorPane {
    Label ol;

    public value() {
        //set ID for use with CSS
        setId("value");

        ol = new Label ("");

        //add the id of the label for use with CSS
        ol.setId("innerTextValue");

        //add text wrapping, set alignment of text and label
        ol.setWrapText(true);
        ol.setAlignment(Pos.TOP_LEFT);
        setTopAnchor(ol, 0.0);
        setLeftAnchor(ol, 0.0);
        setRightAnchor(ol, 0.0);
        setBottomAnchor(ol, 0.0);

        //add the label to the anchorpane
        getChildren().add(ol);

        //set Auto-sizing properties
        setMinSize(100,200);
        setPrefSize(5000,5000);
        setMaxSize(10000,10000);

    }
}
