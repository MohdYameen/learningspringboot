package com.conceptandcoding.learningspringboot.jpaDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void saveUser(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long primaryKey) {
        return employeeRepository.findById(primaryKey).get();
    }
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}




//package com.conceptandcoding.learningspringboot.jpaDemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class EmployeeService {
//    EmployeeRepository employeeRepository;
//
//    public void saveUser(Employee employee){
//        employeeRepository.save(employee);
//    }
//
//    public List<Employee> findAll(){
//        return employeeRepository.findAll();
//    }
//}
