package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // text
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        // user Name
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        // user name fields
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        // password
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        // password fields
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        // button
        Button btn = new Button("Sign in");
        btn.setId("button");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        // login text
        Text actiontarget = new Text();
        actiontarget.setId("actiontarget");
        grid.add(actiontarget, 1, 6);

        // button click event
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actiontarget.setText("Sign in button pressed!");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(Main.class.getResource("login.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
