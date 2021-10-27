package com.hcl.employeemaster.service.service;

import com.hcl.employeemaster.model.entity.EmployeeMaster;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeMasterService {

    Page<EmployeeMaster> getAllEmployees(Predicate predicate, Pageable pageRequest);

    EmployeeMaster getEmployeeById(Long id);

    void validateEmployeeName(String employeeName);

    EmployeeMaster createEmployee(EmployeeMaster employeeMaster);

    EmployeeMaster updateEmployee(EmployeeMaster employeeMaster);

    void deleteEmployee(EmployeeMaster employeeMaster);

}
