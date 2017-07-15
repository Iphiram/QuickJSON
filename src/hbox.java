import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Created by Iphiram on 7/14/2017.
 */
public class hbox extends HBox {
    Button[]     buttons;

    public hbox () {
        //initialize buttons, size and name
        buttons = new Button[3];
        for (int i =0; i < buttons.length; i++) {
            buttons[i] = new Button();
            buttons[i].setPrefSize(100,40);
        }
        buttons[0].setText("this");
        buttons[1].setText("that");
        buttons[2].setText("then");

        //create hbox padding
        setPadding(new Insets(5));
        setSpacing(5);

        //set ID for use with CSS
        setId("hbox");

        //add the buttons to the hbox
        getChildren().addAll(buttons);

        //set Auto-sizing properties
        setMinSize(100,50);
        setPrefSize(5000,50);
        setMaxSize(10000,10000);

    }
}
