package com.hcl.employeemaster.service.exception;

public class ServiceException extends RuntimeException {

    private String code;
    private String key;

    public ServiceException(String code, String key) {

    }
}
