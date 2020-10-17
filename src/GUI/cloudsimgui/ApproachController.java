package GUI.cloudsimgui;

import animatefx.animation.Pulse;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author sabir
 */
public class ApproachController implements Initializable{
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void gotoSelection(ActionEvent event) throws IOException{
        AnchorPane selectionPolicyRoot = FXMLLoader.load(getClass().getResource("/GUI/fxml/selectionPolicy.fxml"));
         Scene scene = new Scene(selectionPolicyRoot);
         scene.getStylesheets().add("/GUI/CSS/approach.css");
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        new Pulse(selectionPolicyRoot).play();
        //root1.getChildren().setAll(selectionPolicyRoot);
    }
    
    @FXML
    private void gotoAllocation(ActionEvent event) throws IOException{
         AnchorPane allocationPolicyRoot = FXMLLoader.load(getClass().getResource("/GUI/fxml/allocationPolicy.fxml"));
         Scene scene = new Scene(allocationPolicyRoot);
         scene.getStylesheets().add("/GUI/CSS/approach.css");
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        new Pulse(allocationPolicyRoot).play();
    }
    
    @FXML
    private void gotoLowerThr(ActionEvent event) throws IOException{
         AnchorPane lowerThrRoot = FXMLLoader.load(getClass().getResource("/GUI/fxml/lowerThr.fxml"));
         Scene scene = new Scene(lowerThrRoot);
         scene.getStylesheets().add("/GUI/CSS/approach.css");
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        new Pulse(lowerThrRoot).play();
    }
}
