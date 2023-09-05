package com.javaguide.departmantservice.service;

import com.javaguide.departmantservice.payload.DepartmentDTO;

public interface DepartmentService {
    DepartmentDTO createDepart(DepartmentDTO departmentDTO);

    DepartmentDTO getBydepartmentCode(String departmentCode);
}
