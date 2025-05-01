package com.conceptandcoding.learningspringboot.jpaDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String employee_name;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    private int employee_age;
    private String employee_address;
    public Employee() {     }
    public Employee(String employee_name, int employee_age, String employee_address) {
        this.employee_name = employee_name;
        this.employee_age = employee_age;
        this.employee_address = employee_address;
    }
}





//package com.conceptandcoding.learningspringboot.jpaDemo;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long employee_id;
//
//
//    private String employee_name;
//    private int employee_age;
//    private String employee_address;
//
//    public Employee(){
//
//    }
//
//    public Employee(String employee_name, int employee_age, String employee_address){
//        this.employee_address=employee_address;
//        this.employee_age=employee_age;
//        this.employee_name=employee_name;
//    }
//
//    public Long getEmployee_id() {
//        return employee_id;
//    }
//
//    public void setEmployee_id(Long employee_id) {
//        this.employee_id = employee_id;
//    }
//
//    public String getEmployee_name() {
//        return employee_name;
//    }
//
//    public void setEmployee_name(String employee_name) {
//        this.employee_name = employee_name;
//    }
//
//    public int getEmployee_age() {
//        return employee_age;
//    }
//
//    public void setEmployee_age(int employee_age) {
//        this.employee_age = employee_age;
//    }
//
//    public String getEmployee_address() {
//        return employee_address;
//    }
//
//    public void setEmployee_address(String employee_address) {
//        this.employee_address = employee_address;
//    }
//
//}
