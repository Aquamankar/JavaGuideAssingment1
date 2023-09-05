package com.javaguide.departmantservice.controller;


import com.javaguide.departmantservice.payload.DepartmentDTO;
import com.javaguide.departmantservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/department")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping
    public ResponseEntity<DepartmentDTO> createDepartmant(@RequestBody DepartmentDTO departmentDTO){
   DepartmentDTO dto =departmentService.createDepart(departmentDTO);
   return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @GetMapping("{code}")
    public  ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable ("code") String departmentCode){
      DepartmentDTO dto=departmentService.getBydepartmentCode(departmentCode);
      return  new ResponseEntity<>(dto,HttpStatus.OK);
  }
}
