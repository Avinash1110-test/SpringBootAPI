package com.hcl.employeemaster.model.repository;

import com.hcl.employeemaster.model.entity.EmployeeMaster;
import com.hcl.employeemaster.model.entity.QEmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

public interface EmployeeMasterRepository extends JpaRepository<EmployeeMaster, Long>, QuerydslPredicateExecutor<EmployeeMaster>, QuerydslBinderCustomizer<QEmployeeMaster> {

    EmployeeMaster findByEmployeeName (String employeeName);

}
