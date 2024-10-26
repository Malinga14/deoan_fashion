package service.employee;

import dto.Employee;
import javafx.collections.ObservableList;
import service.SuperService;

public interface EmployeeService extends SuperService {
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(String id);
    ObservableList<Employee> getAll();
    boolean updateEmployee(Employee employee);
    Employee searchEmployee(String id);
    ObservableList<String> getEmployeeIds();

}
