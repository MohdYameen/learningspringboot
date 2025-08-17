package com.conceptandcoding.learningspringboot.jpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee-api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    /*
    this api is to create employee using get api by passing path virables
    example: GET: http://localhost:8080/employee-api/create-employee/Yameen/25/Rampur
     */
    @GetMapping("/create-employee/{employeeName}/{employeeAge}/{employeeCity}")
    public Employee getEmployees(@PathVariable String employeeName, @PathVariable int employeeAge, @PathVariable String employeeCity) {
        Employee employee = new Employee(employeeName,employeeAge,employeeCity);
//        Employee employee2 = new Employee("Choudhary",23,"Jammu");
//        employeeService.saveUser(employee1);
        employeeService.saveUser(employee);
        return employee;
    }


    // GET : http://localhost:8080/employee-api/find-employee-by-id/2
    @GetMapping("/find-employee-by-id/{id}")
    public Employee findById(@PathVariable Long id) {
//        Employee employee1 = new Employee("Yameen",25,"Rampur");
//        Employee employee2 = new Employee("Choudhary",23,"Jammu");
//        employeeService.saveUser(employee1);
//        employeeService.saveUser(employee2);
        return employeeService.getEmployeeById(id);
    }


    // GET: http://localhost:8080/employee-api/list-all-employees
    @GetMapping("/list-all-employees")
    public List<Employee> listAllEmployees(){
        return employeeService.findAll();
    }


    /*
    create api to create new employee via post api using json body in given format:
    POST: http://localhost:8080/employee-api/create
    {
        "employee_name": "Moin",
        "employee_age": 24,
        "employee_city": "Rampur"
    }
     */

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        employeeService.saveUser(employee);
        return employee;
    }
}
