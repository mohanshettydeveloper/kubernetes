package com.mohan.kubernetes.service;

import com.mohan.kubernetes.model.Employee;
import java.util.List;
import org.springframework.stereotype.Service;

public interface EmployeeService {

  List<Employee> getEmployees();
}
