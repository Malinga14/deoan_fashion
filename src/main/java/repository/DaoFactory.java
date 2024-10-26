package repository;

import repository.employee.EmployeeDaoImpl;
import repository.item.ItemDaoImpl;
import repository.orderdetail.OrderDetailDaoImpl;
import repository.suppleir.SuppleirDaoImpl;
import util.DaoType;

import static com.sun.java.accessibility.util.EventID.ITEM;

public class DaoFactory {
    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance==null?instance=new DaoFactory():instance;
    }

    public <T extends SuperDao>T getDaoType(DaoType type){
        switch (type){
            case ORDERDETAIL:return (T) new OrderDetailDaoImpl();
            case EMPLOYEE:return (T) new EmployeeDaoImpl();
            case SUPPLEIR:return (T) new SuppleirDaoImpl();
            case ITEM:return (T) new ItemDaoImpl();
        }
        return null;

    }
}
