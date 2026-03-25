package com.example.crudthymeleaf.demo.dao;

import com.example.crudthymeleaf.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    /**
     * Find employee from the EMPLOYEE table for given id.
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
     * Saves a new employee or updates an existing one deremined by id of the employee.
     * @param employee Employee object to be saved
     */
    void save(Employee employee);

    /**
     * Deletes an employee for the given id.
     * @param id int id of the employee to be deleted
     */
    void delete(int id);

}
