package controller;

import dto.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemFormController {

    @FXML
    private ImageView imgItem;

    @FXML
    private Label lblItemCode;

    @FXML
    private Label lblItemName;

    @FXML
    private Label lblItemPrice;
    @FXML
    private Item item;

    public void setData(Item item) {
        this.item = item;
        lblItemCode.setText(item.getItemID());
        lblItemName.setText(item.getItemName());
        lblItemPrice.setText(String.valueOf(item.getItemPrice()));
        Image img=new Image(getClass().getResourceAsStream(item.getItemPic()));
        imgItem.setImage(img);
    }


    public void btnADDCart(ActionEvent actionEvent) {
    }
}
