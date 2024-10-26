package service;

import repository.employee.EmployeeDaoImpl;
import service.item.ItemServiceImpl;
import service.orderdetail.OrderDetailServiceImpl;
import service.suppleir.SuppleirServiceImpl;
import util.ServiceType;

public class ServiceFactory {
    private static ServiceFactory instance;
    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance==null?instance=new ServiceFactory():instance;
    }

    public <T extends SuperService>T getServiceType(ServiceType type){
        switch (type){
            case EMPLOYEEE:return (T) new EmployeeDaoImpl();
            case ITEM:return (T) new ItemServiceImpl();
            case SUPPLEIER:return (T) new SuppleirServiceImpl();
            case ORDERDETAIL:return (T) new OrderDetailServiceImpl();
        }
        return null;
    }
}
