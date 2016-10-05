package login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    protected Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Objects.nonNull(button)) {
            button.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Event Type: " + event.getEventType());
                    System.out.println("Hello World");
                }
            });
        }
    }
}
