package githubproject;

//import githubproject.Generator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable
{
    
    @FXML
    private Label label;
    @FXML
    private TextField txtField;
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        txtField.setText(Generator.generate(9));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
    }    
    
}