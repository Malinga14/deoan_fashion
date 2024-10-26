package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Item {
    private String itemID;
    private String itemName;
    private double itemPrice;
    private String itemPic;

    public Item(String itemID, String itemName, double itemPrice, String itemPic) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemPic = itemPic;
    }

    public Item(String id, String name, String price) {
        this.itemID = id;
        this.itemName = name;
        this.itemPrice = Double.parseDouble(price);
    }
}
