package GUI.cloudsimgui;

import animatefx.animation.Pulse;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Saber
 */
public class selectionPolicyController{
    
    @FXML
    private AnchorPane selectionPolicyRoot;
    
    @FXML
    private void goBack(ActionEvent event) throws IOException{
        selectionPolicyRoot.getChildren().clear();
        AnchorPane approach = FXMLLoader.load(getClass().getResource("/GUI/fxml/Approach.fxml"));
        Stage stage = (Stage)selectionPolicyRoot.getScene().getWindow();
        Scene scene = new Scene(approach);
        scene.getStylesheets().add("/GUI/CSS/approach.css");
        stage.setScene(scene);
        stage.show();
        new Pulse(approach).play();
        
        //selectionPolicyRoot.getChildren().setAll(root1);
        
    }


}
