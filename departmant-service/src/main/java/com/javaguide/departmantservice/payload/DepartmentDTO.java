package com.javaguide.departmantservice.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private  long id;
    private String departmentName;
    private   String departmentDescription;

    private String departmentCode;

}
