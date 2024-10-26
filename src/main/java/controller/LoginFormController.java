package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.mail.MessagingException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    public static Stage stage;

    @FXML
    private AnchorPane ancLogin;

    @FXML
    private AnchorPane ancLogo;

    @FXML
    public JFXCheckBox checkBoxLoginForAdmins;

    @FXML
    public JFXCheckBox checkBoxForgotPassword;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtPassword;

    EmployeeDashboardFormController employeeDashboardFormController=new EmployeeDashboardFormController();

    @FXML
    void btnLogin(ActionEvent event) {
            if(checkBoxLoginForAdmins.isSelected()){
                Stage stage = AdminDashboardFormController.stage;
                try{
                    if(Objects.equals(txtEmail.getText(), "malingapasindu12134@gmail.com")||Objects.equals(txtPassword.getText(),"Mp@12134")) {


                        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/admin_dashbord_form.fxml"))));
                        stage.show();
                    }else{
                        new Alert(Alert.AlertType.ERROR, "Wrong e-mail or password,\nPlease Try Again!").show();
                    }

                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }else{
                Stage stage = EmployeeDashboardFormController.stage;
                try {
                    if(Objects.equals(txtEmail.getText(), "malingapasindu12134@gmail.com")||Objects.equals(txtPassword.getText(),"Mp@12134")) {


                        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/employee_dashboard_form.fxml"))));
                        stage.show();
                    }else{
                        new Alert(Alert.AlertType.ERROR, "Wrong e-mail or password,\nPlease Try Again!").show();
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
