package com.hcl.employeemaster.application.controller;

import com.hcl.employeemaster.application.requestDTO.EmployeeMasterRequestDTO;
import com.hcl.employeemaster.application.responseDTO.EmployeeMasterResponseDTO;
import com.hcl.employeemaster.model.entity.EmployeeMaster;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeMasterMapper {

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeMasterResponseDTO entityToResponse(EmployeeMaster employeeMaster) {
        EmployeeMasterResponseDTO employeeMasterResponseDTO = modelMapper.map(employeeMaster, EmployeeMasterResponseDTO.class);
        employeeMasterResponseDTO.setId(employeeMasterResponseDTO.getId());
        return employeeMasterResponseDTO;
    }

    public EmployeeMaster createRequestToEntity(EmployeeMasterRequestDTO employeeMasterRequestDTO) {
        return modelMapper.map(employeeMasterRequestDTO, EmployeeMaster.class);
    }

    public void updateRequestToEntity(EmployeeMasterRequestDTO employeeMasterRequestDTO, EmployeeMaster employeeMaster) {
        modelMapper.map(employeeMasterRequestDTO, employeeMaster);
    }

    public Page<EmployeeMasterResponseDTO> entityPageToResponsePage(Pageable pageable, Page<EmployeeMaster> employeeMasterPage) {
        List<EmployeeMasterResponseDTO> employeeMasterResponseDTOList = new ArrayList<>();
        employeeMasterPage.forEach(employeeMaster -> employeeMasterResponseDTOList.add(entityToResponse(employeeMaster)));
        return new PageImpl<>(employeeMasterResponseDTOList, pageable, employeeMasterPage.getTotalElements());
    }
}
