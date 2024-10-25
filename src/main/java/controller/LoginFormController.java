package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    public static Stage stage;

    @FXML
    private AnchorPane ancLogin;

    @FXML
    private AnchorPane ancLogo;

    @FXML
    private JFXCheckBox checkBoxLoginForAdmins;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    void btnLogin(ActionEvent event) {
        if(checkBoxLoginForAdmins.isSelected()){
            Stage stage = AdminDashboardFormController.stage;
            try{
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/admin_dashbord_form.fxml"))));
                stage.show();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else{
            Stage stage = EmployeeDashboardFormController.stage;
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/employee_dashboard_form.fxml"))));
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
