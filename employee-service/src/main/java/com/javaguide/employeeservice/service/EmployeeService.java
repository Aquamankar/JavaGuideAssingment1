package com.javaguide.employeeservice.service;

import com.javaguide.employeeservice.payload.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO createemp(EmployeeDTO employeeDTO);

    EmployeeDTO getemployeeById(long id);
}
