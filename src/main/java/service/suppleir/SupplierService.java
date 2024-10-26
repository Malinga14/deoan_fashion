package service.suppleir;

import dto.OrderDetail;
import dto.Suppleir;
import javafx.collections.ObservableList;
import service.SuperService;

public interface SupplierService extends SuperService {
    boolean addSuppleir(Suppleir suppleir);
    boolean deleteSuppleir(String id);
    ObservableList<Suppleir> getAll();
    boolean updateSuppleir(Suppleir suppleir);
    Suppleir searchSuppleir(String id);
    ObservableList<String> getSuppleirIds();
}
