package service.orderdetail;

import dto.Item;
import dto.OrderDetail;
import entity.ItemEntity;
import entity.OrderDetailEntity;
import javafx.collections.ObservableList;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.item.ItemDao;
import repository.orderdetail.OrderDetailDao;
import util.DaoType;

public class OrderDetailServiceImpl implements OrderDetailService{
    @Override
    public boolean addOrderDetail(OrderDetail orderDetail) {
        OrderDetailEntity entity = new ModelMapper().map(orderDetail, OrderDetailEntity.class);

        OrderDetailDao orderDetailDao = DaoFactory.getInstance().getDaoType(DaoType.ORDERDETAIL);

        orderDetailDao.save(entity);

        System.out.println("Service Layer : " + orderDetail);
        return false;
    }

    @Override
    public boolean deleteOrderDetail(String id) {
        return false;
    }

    @Override
    public ObservableList<OrderDetail> getAll() {
        return null;
    }

    @Override
    public boolean updateOrderDetail(OrderDetail orderDetail) {
        return false;
    }

    @Override
    public OrderDetail searchOrderDetail(String id) {
        return null;
    }

    @Override
    public ObservableList<String> getOrderDetailIds() {
        return null;
    }
}
