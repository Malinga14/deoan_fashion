package repository.item;

import entity.EmployeeEntity;
import entity.ItemEntity;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import util.HibernateUtil;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean save(ItemEntity item) {
        System.out.println("Repository : "+item);

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist(item);
        session.getTransaction().commit();
        session.close();
        return false;

    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ObservableList<ItemEntity> getAll() {
        return null;
    }

    @Override
    public boolean update(ItemEntity item) {
        return false;
    }

    @Override
    public ItemEntity search(String id) {
        return null;
    }
}
