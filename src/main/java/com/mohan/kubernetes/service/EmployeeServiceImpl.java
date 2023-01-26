package com.mohan.kubernetes.service;

import com.mohan.kubernetes.model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

  List<Employee> employeesList = new ArrayList<>();

  @Override
  public List<Employee> getEmployees() {
    Employee e1 = Employee.builder()
        .id(1)
        .firstName("Mohan1")
        .lastName("Shetty1")
        .age(51)
        .build();
    Employee e2 = Employee.builder()
        .id(2)
        .firstName("Mohan2")
        .lastName("Shetty2")
        .age(52)
        .build();

    employeesList.add(e1);
    employeesList.add(e2);

    return employeesList;
  }
}
