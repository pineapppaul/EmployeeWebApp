package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

  static List<Employee> employees = new ArrayList<>();

  public List<Employee> getAllEmployees(){

    Employee paul = new Employee(1, "Paul", "Cheung", new Address(2885, "ave Barclay", "Montreal", "QC", "H3S 1J7"));
    Employee andrei = new Employee(2, "Andrei", "Brailovski", new Address(51, "rue de Louvain O.", "Montreal", "QC", "H2N 1A3"));

    employees.add(paul);
    employees.add(andrei);

    return employees;
  }

  public Employee getEmployeeById(int id) {
    for (Employee emp: employees) {
      if (emp.getId() == id) {
        return emp;
      }
    }
    return null;
  }

  public void addEmployee(Employee emp) {
    employees.add(emp);
  }

}


