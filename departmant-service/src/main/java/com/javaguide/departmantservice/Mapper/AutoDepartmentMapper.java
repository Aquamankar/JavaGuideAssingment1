package com.javaguide.departmantservice.Mapper;

import com.javaguide.departmantservice.entity.Department;
import com.javaguide.departmantservice.payload.DepartmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoDepartmentMapper {

    AutoDepartmentMapper MAPPER= Mappers.getMapper(AutoDepartmentMapper.class);

    Department mapToEntity(DepartmentDTO departmentDTO);
     DepartmentDTO mapToDTO(Department department);
}
