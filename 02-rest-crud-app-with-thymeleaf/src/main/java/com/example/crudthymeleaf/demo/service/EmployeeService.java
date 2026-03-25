package com.example.crudthymeleaf.demo.service;

import com.example.crudthymeleaf.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * Find employee from table EMPLOYEE for given id.
     * @param id int id of the employee
     * @return Employee object
     */
    Employee findById(int id);

    /**
     * Find all employees from the EMPLOYEE table.
     * @return List of all the employee from the table
     */
    List<Employee> findAll();

    /**
     * Saves a new employee or updates an existing one determined by id of the employee.
     * @param employee Employee object to be saved
     */
    void saveEmployee(Employee employee);

    /**
     * Deletes an employee for the given id.
     * @param id int id of the employee to be deleted
     */
    void deleteEmployee(int id);
}
