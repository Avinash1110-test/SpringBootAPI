package com.hcl.employeemaster.service.serviceImpl;

import com.hcl.employeemaster.model.entity.EmployeeMaster;
import com.hcl.employeemaster.model.repository.EmployeeMasterRepository;
import com.hcl.employeemaster.service.exception.ServiceErrors;
import com.hcl.employeemaster.service.exception.ServiceException;
import com.hcl.employeemaster.service.service.EmployeeMasterService;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeMasterServiceImpl implements EmployeeMasterService {

    private final EmployeeMasterRepository employeeMasterRepository;

    public EmployeeMasterServiceImpl(EmployeeMasterRepository employeeMasterRepository) {
        this.employeeMasterRepository = employeeMasterRepository;
    }

    @Override
    public Page<EmployeeMaster> getAllEmployees(Predicate predicate, Pageable pageRequest) {
        return employeeMasterRepository.findAll(predicate, pageRequest);
    }

    @Override
    public EmployeeMaster getEmployeeById(Long id) {
        return employeeMasterRepository.findById(id).orElseThrow(() -> new ServiceException(ServiceErrors.EMPLOYEE_ID_NOT_EXIST.CODE, ServiceErrors.EMPLOYEE_ID_NOT_EXIST.KEY));
    }

    @Override
    public void validateEmployeeName(String employeeName) {
        if (employeeMasterRepository.findByEmployeeName(employeeName) != null) {
            throw new ServiceException(ServiceErrors.EMPLOYEE_NAME_ALREADY_EXIST.CODE, ServiceErrors.EMPLOYEE_NAME_ALREADY_EXIST.KEY);
        }
    }

    @Override
    public EmployeeMaster createEmployee(EmployeeMaster employeeMaster) {
        return employeeMasterRepository.save(employeeMaster);
    }

    @Override
    public EmployeeMaster updateEmployee(EmployeeMaster employeeMaster) {
        return employeeMasterRepository.save(employeeMaster);
    }

    @Override
    public void deleteEmployee(EmployeeMaster employeeMaster) {
        employeeMasterRepository.delete(employeeMaster);
    }
}
