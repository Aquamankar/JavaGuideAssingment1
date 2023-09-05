package com.javaguide.employeeservice.controller;

import com.javaguide.employeeservice.payload.EmployeeDTO;
import com.javaguide.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
     EmployeeDTO employeeDTO1=  employeeService.createemp(employeeDTO);
     return  new ResponseEntity<>(employeeDTO1, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") long id){
       EmployeeDTO employeeDTO= employeeService.getemployeeById(id);
       return  new ResponseEntity<>(employeeDTO,HttpStatus.OK);
    }

}
