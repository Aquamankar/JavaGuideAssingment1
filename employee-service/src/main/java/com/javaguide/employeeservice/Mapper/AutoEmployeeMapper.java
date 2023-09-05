package com.javaguide.employeeservice.Mapper;

import com.javaguide.employeeservice.entity.Employee;
import com.javaguide.employeeservice.payload.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoEmployeeMapper {
    AutoEmployeeMapper Mapper= Mappers.getMapper(AutoEmployeeMapper.class);

    EmployeeDTO mapToDTO(Employee employee);

    Employee mapToEntity(EmployeeDTO employeeDTO);

}
