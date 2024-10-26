package service.item;

import dto.Employee;
import dto.Item;
import javafx.collections.ObservableList;
import service.SuperService;

public interface ItemService extends SuperService {
    boolean addItem(Item item);
    boolean deleteItem(String id);
    ObservableList<Item> getAll();
    boolean updateItem(Item item);
    Item searchItem(String id);
    ObservableList<String> getItemIds();

}
