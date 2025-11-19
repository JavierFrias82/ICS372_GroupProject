package org.demo.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label lblstatus;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    public void Login(ActionEvent event) throws IOException {
        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")){
            lblstatus.setText("Login Success");
            Stage stage_new = new Stage();
            FXMLLoader fxmlLoader_new = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
            Scene scene_new = new Scene(fxmlLoader_new.load(), 300, 300);
            stage_new.setTitle("Hello!");
            stage_new.setScene(scene_new);
            stage_new.show();
        }else{
            lblstatus.setText("Login Failed");
        }
    }
}
