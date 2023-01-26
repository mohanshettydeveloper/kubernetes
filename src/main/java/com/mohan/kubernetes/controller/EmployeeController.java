package com.mohan.kubernetes.controller;

import com.mohan.kubernetes.model.Employee;
import com.mohan.kubernetes.service.EmployeeService;
import java.util.List;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @GetMapping("/list")
  public ResponseEntity<List<Employee>> getEmployees() {
    return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);

  }

}
