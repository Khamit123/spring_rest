package spring_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring_rest.entity.Employees;
import spring_rest.services.ServiceEmp;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private ServiceEmp<Employees> employeesService;
    @GetMapping("/employees")
    public List<Employees> showAll(){

        List<Employees> employeesList=employeesService.getAll();

        return employeesList;
    }
    @GetMapping("/employees/{employeeID}")
    public Employees getById(@PathVariable("employeeID") int employeeID){

        return employeesService.getById(employeeID);
    }



    @PostMapping("/employees")
    public Employees addEmployeePost(@RequestBody Employees employees){

        return employeesService.add(employees);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeesService.delete(id);
        return "Employee with id "+id+" was deleted";
    }

    @PutMapping("/employees")
    public String updateEmployee(@RequestBody Employees employees){
        employeesService.update(employees);
        return "Employee with id "+employees.getId()+" was updated";
    }

}
