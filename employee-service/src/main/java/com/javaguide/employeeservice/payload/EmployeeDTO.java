package com.javaguide.employeeservice.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private long id;
    private  String fname;
    private  String lname;

    private  String email;
}
