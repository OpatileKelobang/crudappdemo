package za.co.bogote.crudappdemo.DAO;

import za.co.bogote.crudappdemo.Modal.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
