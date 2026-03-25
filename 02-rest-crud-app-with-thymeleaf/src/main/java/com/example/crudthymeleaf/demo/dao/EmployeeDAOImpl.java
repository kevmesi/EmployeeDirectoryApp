package com.example.crudthymeleaf.demo.dao;

import com.example.crudthymeleaf.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    EntityManager em;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    public Employee findById(int id) {
        return em.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        return em.createQuery("select e from Employee e order by lastName asc", Employee.class).getResultList();
    }

    @Override
    public void save(Employee employee) {
        em.merge(employee);
    }

    @Override
    public void delete(int id) {
        Employee employeeToDelete = findById(id);
        em.remove(employeeToDelete);
    }
}
