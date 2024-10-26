package service.suppleir;

import dto.Suppleir;
import entity.SuppleirEntity;
import javafx.collections.ObservableList;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.suppleir.SuppleirDao;
import util.DaoType;

public class SuppleirServiceImpl implements SupplierService {
    @Override
    public boolean addSuppleir(Suppleir suppleir) {
        SuppleirEntity entity = new ModelMapper().map(suppleir, SuppleirEntity.class);

        SuppleirDao suppleirlDao = DaoFactory.getInstance().getDaoType(DaoType.SUPPLEIR);

        suppleirlDao.save(entity);

        System.out.println("Service Layer : " + suppleir);
        return false;
    }

    @Override
    public boolean deleteSuppleir(String id) {
        return false;
    }

    @Override
    public ObservableList<Suppleir> getAll() {
        return null;
    }

    @Override
    public boolean updateSuppleir(Suppleir suppleir) {
        return false;
    }

    @Override
    public Suppleir searchSuppleir(String id) {
        return null;
    }

    @Override
    public ObservableList<String> getSuppleirIds() {
        return null;
    }
}
