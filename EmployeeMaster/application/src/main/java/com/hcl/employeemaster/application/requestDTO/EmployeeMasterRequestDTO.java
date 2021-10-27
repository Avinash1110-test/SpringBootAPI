package com.hcl.employeemaster.application.requestDTO;

import com.hcl.employeemaster.model.enums.BloodGroup;
import com.hcl.employeemaster.model.enums.EmployeeBand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMasterRequestDTO {

    //String employeeCode;

    String employeeName;

    Long designationMasterId;

    Long reportingManagerId;

    Long locationMasterId;

    Double salary;

    BloodGroup bloodGroup;

    EmployeeBand employeeBand;

    Date doj;

    Date dob;

    String fatherName;

    String motherName;

    private List<Long> employeeAddresses = new ArrayList<>();

    String contactNo;

    String note;
}
