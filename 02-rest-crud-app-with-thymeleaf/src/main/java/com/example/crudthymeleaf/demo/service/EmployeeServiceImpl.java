package com.example.crudthymeleaf.demo.service;

import com.example.crudthymeleaf.demo.dao.EmployeeDAO;
import com.example.crudthymeleaf.demo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.delete(id);
    }
}
