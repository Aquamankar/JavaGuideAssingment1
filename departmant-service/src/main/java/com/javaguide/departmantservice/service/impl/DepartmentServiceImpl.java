package com.javaguide.departmantservice.service.impl;

import com.javaguide.departmantservice.Mapper.AutoDepartmentMapper;
import com.javaguide.departmantservice.entity.Department;
import com.javaguide.departmantservice.exception.ResourceNotFoundException;
import com.javaguide.departmantservice.payload.DepartmentDTO;
import com.javaguide.departmantservice.repository.DepartmentRepository;
import com.javaguide.departmantservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {



    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDTO createDepart(DepartmentDTO departmentDTO) {
        //Department department = modelMapper.map(departmentDTO, Department.class);
   //     Department department = mapToEntity(departmentDTO);
        Department department = AutoDepartmentMapper.MAPPER.mapToEntity(departmentDTO);
        Department save = departmentRepository.save(department);

      //  return mapToDTO(save);
        // DepartmentDTO dto = modelMapper.map(save, DepartmentDTO.class);
        DepartmentDTO dto = AutoDepartmentMapper.MAPPER.mapToDTO(save);
        return  dto;
    }

    @Override
    public DepartmentDTO getBydepartmentCode(String departmentCode) {
//        Optional<Department> byDepartmentCode = departmentRepository.findByDepartmentCode(departmentCode);
//        Department department = byDepartmentCode.get();
        Department department = departmentRepository.findByDepartmentCode(departmentCode).
                orElseThrow(() -> new ResourceNotFoundException("Department", "DepartmentCode", departmentCode));

        // DepartmentDTO dto = modelMapper.map(department, DepartmentDTO.class);
        DepartmentDTO dto = AutoDepartmentMapper.MAPPER.mapToDTO(department);

       // return mapToDTO(department);
        return  dto;
    }

//    public DepartmentDTO mapToDTO(Department department){
//        DepartmentDTO dto=new DepartmentDTO();
//        dto.setId(department.getId());
//        dto.setDepartmentName(department.getDepartmentName());
//        dto.setDepartmentDescription(department.getDepartmentDescription());
//        dto.setDepartmentCode(department.getDepartmentCode());
//        return dto;
//    }
//    public Department mapToEntity(DepartmentDTO departmentDTO){
//        Department department=new Department();
//        department.setId(departmentDTO.getId());
//        department.setDepartmentName(departmentDTO.getDepartmentName());
//        department.setDepartmentDescription(departmentDTO.getDepartmentDescription());
//        department.setDepartmentCode(departmentDTO.getDepartmentCode());
//        return department;
//    }
}
