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
 *
 * @author Saber
 */
public class lowerThrController {
    
    @FXML
    private AnchorPane lowerThrRoot;
    
    @FXML
    private void goBack(ActionEvent event) throws IOException{
        AnchorPane approach = FXMLLoader.load(getClass().getResource("/GUI/fxml/Approach.fxml"));
        Scene scene = new Scene(approach);
        scene.getStylesheets().add("/GUI/CSS/approach.css");
        Stage stage = (Stage)lowerThrRoot.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        new Pulse(approach).play();
    }
    
}
