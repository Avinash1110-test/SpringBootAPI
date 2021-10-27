package com.hcl.employeemaster.application.controller;

import com.hcl.employeemaster.application.requestDTO.EmployeeMasterRequestDTO;
import com.hcl.employeemaster.application.responseDTO.EmployeeMasterResponseDTO;
import com.hcl.employeemaster.application.responseDTO.ResponseDTO;
import com.hcl.employeemaster.model.entity.EmployeeMaster;
import com.hcl.employeemaster.service.service.EmployeeMasterService;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/employeeMaster")
public class EmployeeMasterController {

    @Autowired
    private EmployeeMasterService employeeMasterService;

    @Autowired
    private EmployeeMasterMapper employeeMasterMapper;

    @GetMapping(value = "/allEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getAllEmployees (@QuerydslPredicate(root = EmployeeMaster.class) Predicate predicate,
                                                        @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20) @Parameter(hidden = true) Pageable pageRequest) {
        Page<EmployeeMaster> employeeMasterPage = employeeMasterService.getAllEmployees(predicate, pageRequest);
        Page<EmployeeMasterResponseDTO> employeeMasterResponseDTOS = employeeMasterMapper.entityPageToResponsePage(pageRequest, employeeMasterPage);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, employeeMasterResponseDTOS, null);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getEmployeeById (@PathVariable("employeeId") Long employeeId) {
        EmployeeMasterResponseDTO employeeMasterResponseDTO = employeeMasterMapper.entityToResponse(employeeMasterService.getEmployeeById(employeeId));
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, employeeMasterResponseDTO, null);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> createEmployee (@RequestBody EmployeeMasterRequestDTO employeeMasterRequestDTO) {
        EmployeeMaster employeeMaster = employeeMasterMapper.createRequestToEntity(employeeMasterRequestDTO);
        employeeMasterService.validateEmployeeName(employeeMaster.getEmployeeName());
        employeeMaster = employeeMasterService.createEmployee(employeeMaster);
        EmployeeMasterResponseDTO employeeMasterResponseDTO = employeeMasterMapper.entityToResponse(employeeMaster);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, employeeMasterResponseDTO, null);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @PutMapping(value = "/{employeeId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> updateEmployee (@PathVariable("employeeId") Long employeeId, @RequestBody EmployeeMasterRequestDTO employeeMasterRequestDTO) {
        EmployeeMaster employeeMaster = employeeMasterService.getEmployeeById(employeeId);
        if (!employeeMaster.getEmployeeName().equals(employeeMasterRequestDTO.getEmployeeName())) {
            employeeMasterService.validateEmployeeName(employeeMasterRequestDTO.getEmployeeName());
        }
        employeeMasterMapper.updateRequestToEntity(employeeMasterRequestDTO, employeeMaster);
        employeeMaster = employeeMasterService.updateEmployee(employeeMaster);
        EmployeeMasterResponseDTO employeeMasterResponseDTO = employeeMasterMapper.entityToResponse(employeeMaster);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, employeeMasterResponseDTO, null);
        return ResponseEntity.ok(responseDTO);
    }

    @DeleteMapping(value = "/{employeeId}")
    public ResponseEntity<ResponseDTO> deleteEmployee (@PathVariable("employeeId") Long employeeId) {
        EmployeeMaster employeeMaster = employeeMasterService.getEmployeeById(employeeId);
        employeeMasterService.deleteEmployee(employeeMaster);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, null, null);
        return ResponseEntity.ok(responseDTO);
    }
}
