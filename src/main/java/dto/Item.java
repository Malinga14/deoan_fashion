package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
    private String itemID;
    private double itemPrice;
    private String itemName;;

    public Item(String itemID, double itemPrice, String itemName) {
        this.itemID=itemID;
        this.itemPrice=itemPrice;
        this.itemName=itemName;

    }
}
