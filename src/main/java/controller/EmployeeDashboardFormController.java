package controller;

import com.jfoenix.controls.*;
import dto.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import lombok.Data;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

@Data
public class EmployeeDashboardFormController implements Initializable {


    public static Stage stage;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colPrice;

    @FXML
    private TableView tblCart;

    @FXML
    private GridPane grid;

    @FXML
    private GridPane gridBilView;

    @FXML
    private TextField txtCustomerEmail;

    @FXML
    private TextField txtGivenMoney;

    @FXML
    private Label lblTotalDisplay;

    @FXML
    private VBox vBoxItems;

    @FXML
    private AnchorPane anchorPaneItems;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private JFXButton btnPay;

    @FXML
    private JFXButton btnReports;

    @FXML
    private HBox btnSearch;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField txtSearch;

    @FXML
    private ImageView imgItem;

    private List<Item> items=new ArrayList<>();
    private Item item;

    //----------set cart-----------------------
    public void loadCart(String id, String name, String price){
        ObservableList<Item> itemObservableList = FXCollections.observableArrayList(
            new Item(id, name, price)
        );
        Item item=new Item("ID001", "T-Shirt", "14.75");
        tblCart.getItems().add(item);


        colID.setCellFactory(new PropertyValueFactory<>(id));
        colName.setCellFactory(new PropertyValueFactory<>(name));
        colPrice.setCellFactory(new PropertyValueFactory<>(price));
        tblCart.setItems(itemObservableList);

    }

    //--------Get data from database---------------
    private List<Item> getData(){
        items=new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            item=new Item();
            item.setItemName("T-Shirt");
            item.setItemID(STR."ID0\{i}");
            item.setItemPrice(14.75);
            item.setItemPic("/img/tshirt.png");
            items.add(item);
        }
        return items;
    }

    //-------Set & load items dynamically-----------
    void loadItems(){
        items.addAll(getData());
        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < items.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/view/item_form.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemFormController itemFormController = fxmlLoader.getController();
                itemFormController.setData(items.get(i));

                grid.add(anchorPane, column++, row);

                if (column == 4) {
                    column = 0;
                    row++;
                }
                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadItems();
    }


    public void btnAddItem(ActionEvent actionEvent) {
    }

    public void btnReports(ActionEvent actionEvent) {
    }

    public void checkBoxMens(ActionEvent actionEvent) {
    }

    public void checkBoxKids(ActionEvent actionEvent) {
    }

    public void btnSearch(ActionEvent actionEvent) {
    }

    public void btnPay(ActionEvent actionEvent) {
        try {
            sendEmail("nipunanupama18@gmail.com", "Your new password is: 123456");
        }catch (MessagingException e){
            throw new RuntimeException(e);
        }
    }

    public void checkBoxWomens(ActionEvent actionEvent) {
    }

    public void btnLogOut(ActionEvent actionEvent) {
        Stage stage = LoginFormController.stage;
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
            stage.show();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @FXML
    void sendEmail(String recipientEmail, String s) throws MessagingException {
        Properties properties=new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myEmail ="malingapasindu14@gmail.com";
        String password = "roby ricr vmse eydx";

        Session session= Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail, password);
            }
        });
        Message message=prepareMessage(session, myEmail, recipientEmail, "Payment Confirmation");
        if (message!=null){
            new Alert(Alert.AlertType.INFORMATION, "Email sent successfully").show();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please Try Again!").show();
        }
        Transport.send(message);
    }

    private Message prepareMessage(Session session, String myEmail, String recipientEmail, String msg) {
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{
                    new InternetAddress(recipientEmail)
            });

            message.setSubject("Hello nipun!");
            message.setText(msg);

            return message;
        }catch (Exception e){
            Logger.getLogger(EmployeeDashboardFormController.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

}
