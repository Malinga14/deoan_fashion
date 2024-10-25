package controller;

import com.jfoenix.controls.*;
import dto.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.Data;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Data
public class DashboardFormController implements Initializable {


    public static Stage stage;

    @FXML
    public GridPane grid;

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

    private List<Item> getData(){
        items=new ArrayList<>();

        for (int i=0;i<10;i++){
            item=new Item();
            item.setItemName("T-Shirt");
            item.setItemID("ITS000"+i+"");
            item.setItemPrice(14.75);
            items.add(item);
        }
        return items;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        items.addAll(getData());
        int column = 0;
        int row = 0;

        try {
            for (int i = 0; i < items.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/view/item_form.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemFormController itemFormController = fxmlLoader.getController();

                grid.add(anchorPane, column++, row);

                if (column == 5) {
                    column = 0;
                    row++;
                }
                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    }

    public void checkBoxWomens(ActionEvent actionEvent) {
    }
}
