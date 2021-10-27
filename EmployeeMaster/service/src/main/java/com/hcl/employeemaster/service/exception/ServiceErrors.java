package com.hcl.employeemaster.service.exception;

public enum ServiceErrors {

    EMPLOYEE_ID_NOT_EXIST("ERR-103", "Employee Id does not exist. Please enter valid Id"),
    EMPLOYEE_NAME_ALREADY_EXIST("ERR-104", "Employee name already exist. Please try different name");

    public final String CODE;
    public final String KEY;

    ServiceErrors(String code, String key) {
        this.CODE = code;
        this.KEY = key;
    }
}
