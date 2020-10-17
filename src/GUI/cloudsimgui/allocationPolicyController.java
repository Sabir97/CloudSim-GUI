package GUI.cloudsimgui;

import animatefx.animation.Pulse;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Sabir Mohammedi Taieb
 */

public class allocationPolicyController {
    @FXML
    private AnchorPane allocationPolicyRoot;
    
    @FXML
    private void goBack(ActionEvent event) throws IOException{
         allocationPolicyRoot.getChildren().clear();
        AnchorPane approach = FXMLLoader.load(getClass().getResource("/GUI/fxml/Approach.fxml"));
        Stage stage = (Stage)allocationPolicyRoot.getScene().getWindow();
        Scene scene = new Scene(approach);
        scene.getStylesheets().add("/GUI/CSS/approach.css");
        stage.setScene(scene);
        stage.show();
        new Pulse(approach).play();
    }
    
}
