package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}
