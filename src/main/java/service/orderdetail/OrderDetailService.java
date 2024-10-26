package service.orderdetail;

import dto.Item;
import dto.OrderDetail;
import javafx.collections.ObservableList;
import service.SuperService;

public interface OrderDetailService extends SuperService {
    boolean addOrderDetail(OrderDetail orderDetail);
    boolean deleteOrderDetail(String id);
    ObservableList<OrderDetail> getAll();
    boolean updateOrderDetail(OrderDetail orderDetail);
    OrderDetail searchOrderDetail(String id);
    ObservableList<String> getOrderDetailIds();
}
