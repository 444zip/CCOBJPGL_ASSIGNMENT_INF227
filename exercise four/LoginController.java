import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {

    @FXML
    TextField myusernamefield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    public void login(ActionEvent event) throws IOException {

        // get input in my textfield and store in a variable
        String username = myusernamefield.getText();

        // get input in my passwordfield and store in a variable
        String password = mypasswordfield.getText();

        System.out.println(username);
        System.out.println(password);

        // If username and password matches, go to Scene.fxml
        if (username.equals("mika") && password.equals("abc123")) {

            // Load Scene.fxml
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

    }

}