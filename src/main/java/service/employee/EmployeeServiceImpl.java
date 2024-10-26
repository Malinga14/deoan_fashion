package service.employee;

import dto.Employee;
import entity.EmployeeEntity;
import javafx.collections.ObservableList;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.employee.EmployeeDao;
import util.DaoType;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public boolean addEmployee(Employee employee) {
        EmployeeEntity entity = new ModelMapper().map(employee, EmployeeEntity.class);

        EmployeeDao employeeDao = DaoFactory.getInstance().getDaoType(DaoType.EMPLOYEE);

        employeeDao.save(entity);

        System.out.println("Service Layer : " + employee);
        return false;
    }

    @Override
    public boolean deleteEmployee(String id) {
        return false;
    }

    @Override
    public ObservableList<Employee> getAll() {
        return null;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee searchEmployee(String id) {
        return null;
    }

    @Override
    public ObservableList<String> getEmployeeIds() {
        return null;
    }
}
