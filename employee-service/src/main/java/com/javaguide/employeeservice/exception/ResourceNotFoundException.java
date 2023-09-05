package com.javaguide.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{
    private  String resourseName;
    private  String fieldName;
    private  Long fieldValue;

    public ResourceNotFoundException(String resourseName, String fieldName, Long fieldValue){
        super(String.format("%s not Found with %s : %s",resourseName,fieldName,fieldValue));
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
        this.resourseName=resourseName;
    }
}
