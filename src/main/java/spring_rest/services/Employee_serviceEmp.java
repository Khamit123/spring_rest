package spring_rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_rest.dao.DAO;
import spring_rest.entity.Employees;

import java.util.List;

@Service
public class Employee_serviceEmp implements ServiceEmp<Employees> {

    @Autowired
    private DAO<Employees> empDAO;

    @Override
    @Transactional
    public List<Employees> getAll() {
        return empDAO.getAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        empDAO.delete(id);
    }

    @Override
    @Transactional
    public void update(Employees obj) {
        empDAO.update(obj);
    }

    @Override
    @Transactional
    public Employees add(Employees obj) {
       return empDAO.add(obj);
    }

    @Override
    @Transactional
    public Employees getById(int id) {
        return empDAO.getById(id);
    }
}
