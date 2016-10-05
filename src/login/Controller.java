package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text actiontarget;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        actiontarget.setText("Sign in Success");
    }
}
