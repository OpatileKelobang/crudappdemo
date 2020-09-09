package za.co.bogote.crudappdemo.Service;

import za.co.bogote.crudappdemo.Modal.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
