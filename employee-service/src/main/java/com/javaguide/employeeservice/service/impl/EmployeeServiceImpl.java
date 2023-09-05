package com.javaguide.employeeservice.service.impl;

import com.javaguide.employeeservice.Mapper.AutoEmployeeMapper;
import com.javaguide.employeeservice.entity.Employee;
import com.javaguide.employeeservice.payload.EmployeeDTO;
import com.javaguide.employeeservice.repository.EmployeeRepository;
import com.javaguide.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

//    public Employee mapToDTO(EmployeeDTO employeeDTO){
//        Employee employee=new Employee(
//                employeeDTO.getId(),
//                employeeDTO.getFnmae(),
//                employeeDTO.getLname(),
//                employeeDTO.getEmail()
//        );
//        return employee;
//    }
//    public EmployeeDTO mapToEntity(Employee employee){
//        EmployeeDTO employeeDTO=new EmployeeDTO(
//                employee.getId(),
//                employee.getFnmae(),
//                employee.getLname(),
//                employee.getEmail()
//        );
//        return employeeDTO;
//    }

    @Override
    public EmployeeDTO createemp(EmployeeDTO employeeDTO) {
       //Employee employee = modelMapper.map(employeeDTO, Employee.class);
        Employee employee = AutoEmployeeMapper.Mapper.mapToEntity(employeeDTO);
        Employee saved = employeeRepository.save(employee);
       // EmployeeDTO employeeDTO = modelMapper.map(saved, EmployeeDTO.class);
        return AutoEmployeeMapper.Mapper.mapToDTO(saved);
    }

    @Override
    public EmployeeDTO getemployeeById(long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.get();
        // EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
        return AutoEmployeeMapper.Mapper.mapToDTO(employee);
    }
}
