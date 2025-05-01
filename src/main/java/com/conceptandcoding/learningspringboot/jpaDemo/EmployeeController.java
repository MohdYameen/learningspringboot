package com.conceptandcoding.learningspringboot.jpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jpa-api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployee-using-jpa")
    public List<Employee> getEmployees() {
        Employee employee1 = new Employee("Yameen",25,"Rampur");
        Employee employee2 = new Employee("Choudhary",23,"Jammu");
        employeeService.saveUser(employee1);
        employeeService.saveUser(employee2);
        return employeeService.findAll();
    }

    @GetMapping("/find-by-id-jpa")
    public Employee findById() {
        Employee employee1 = new Employee("Yameen",25,"Rampur");
        Employee employee2 = new Employee("Choudhary",23,"Jammu");
        employeeService.saveUser(employee1);
        employeeService.saveUser(employee2);
        return employeeService.getEmployeeById(1L);
    }
}


//@RestController
//@RequestMapping("/jpa-api")
//public class EmployeeController {
//
//    @Autowired
//    EmployeeService employeeService;
//
//    @GetMapping("/get-employee-using-jpa")
//    public List<Employee> getEmployees(){
//        Employee e1 = new Employee("Yameen", 24, "Rampur");
//        Employee e2 = new Employee("Choudhary", 22, "Jammu");
//
//        employeeService.saveUser(e1);
//        employeeService.saveUser(e2);
//
//        return employeeService.findAll();
//    }
//}
