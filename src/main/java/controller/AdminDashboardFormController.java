package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.Data;

import java.io.IOException;

@Data
public class AdminDashboardFormController {

    public static Stage stage;

    @FXML
    private AnchorPane anchorEmployees;

    @FXML
    private AnchorPane anchorItems;

    @FXML
    private AnchorPane anchorSuppliers;

    @FXML
    private TableColumn<?, ?> colEmployeesEmail;

    @FXML
    private TableColumn<?, ?> colEmployeesID;

    @FXML
    private TableColumn<?, ?> colEmployeesNIC;

    @FXML
    private TableColumn<?, ?> colEmployeesName;

    @FXML
    private TableColumn<?, ?> colEmployeesPassword;

    @FXML
    private TableColumn<?, ?> colEmployeesPhoneNo;

    @FXML
    private TableColumn<?, ?> colItemsEmployeesID;

    @FXML
    private TableColumn<?, ?> colItemsID;

    @FXML
    private TableColumn<?, ?> colItemsName;

    @FXML
    private TableColumn<?, ?> colItemsQTY;

    @FXML
    private TableColumn<?, ?> colItemsUnitPrice;

    @FXML
    private TableColumn<?, ?> colSupplierEmail;

    @FXML
    private TableColumn<?, ?> colSupplierID;

    @FXML
    private TableColumn<?, ?> colSupplierNIC;

    @FXML
    private TableColumn<?, ?> colSupplierName;

    @FXML
    private TableColumn<?, ?> colSupplierPassword;

    @FXML
    private TableColumn<?, ?> colSupplierPhoneNo;

    @FXML
    private TableView<?> tblEmployees;

    @FXML
    private TableView<?> tblItems;

    @FXML
    private TableView<?> tblSuppliers;

    @FXML
    private JFXTextField txtEmployeeEmail;

    @FXML
    private JFXTextField txtEmployeeID;

    @FXML
    private JFXTextField txtEmployeeNIC;

    @FXML
    private JFXTextField txtEmployeeName;

    @FXML
    private JFXTextField txtEmployeePassword;

    @FXML
    private JFXTextField txtEmployeePhoneNo;

    @FXML
    private JFXTextField txtItemsEmployeerID;

    @FXML
    private JFXTextField txtItemsID;

    @FXML
    private JFXTextField txtItemsName;

    @FXML
    private JFXTextField txtItemsQTY;

    @FXML
    private JFXTextField txtItemsUnitPrice;

    @FXML
    private JFXTextField txtSuppliersEmail;

    @FXML
    private JFXTextField txtSuppliersID;

    @FXML
    private JFXTextField txtSuppliersNIC;

    @FXML
    private JFXTextField txtSuppliersName;

    @FXML
    private JFXTextField txtSuppliersPassword;

    @FXML
    private JFXTextField txtSuppliersPhoneNo;

    @FXML
    void bntItemsAdd(ActionEvent event) {

    }

    @FXML
    void bntItemsDelete(ActionEvent event) {

    }

    @FXML
    void bntItemsSearch(ActionEvent event) {

    }

    @FXML
    void bntItemsUpdate(ActionEvent event) {

    }

    @FXML
    void btnEmployeeAdd(ActionEvent event) {

    }

    @FXML
    void btnEmployeeDelete(ActionEvent event) {

    }

    @FXML
    void btnEmployeeSearch(ActionEvent event) {

    }

    @FXML
    void btnEmployeeUpdate(ActionEvent event) {

    }

    @FXML
    void btnEmployees(ActionEvent event) {
        anchorEmployees.setVisible(true);
        anchorItems.setVisible(false);
        anchorSuppliers.setVisible(false);
    }

    @FXML
    void btnItems(ActionEvent event) {
        anchorEmployees.setVisible(false);
        anchorItems.setVisible(true);
        anchorSuppliers.setVisible(false);
    }

    @FXML
    void btnLogOut(ActionEvent event) {
        Stage stage = LoginFormController.stage;
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
            stage.show();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnReports(ActionEvent event) {

    }

    @FXML
    void btnSuppliers(ActionEvent event) {
        anchorEmployees.setVisible(false);
        anchorItems.setVisible(false);
        anchorSuppliers.setVisible(true);
    }

    @FXML
    void btnSupplyersAdd(ActionEvent event) {

    }

    @FXML
    void btnSupplyersDelete(ActionEvent event) {

    }

    @FXML
    void btnSupplyersSearch(ActionEvent event) {

    }

    @FXML
    void btnSupplyersUpdate(ActionEvent event) {

    }

}
