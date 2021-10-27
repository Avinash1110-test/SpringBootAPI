package com.hcl.employeemaster.application.responseDTO;

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
public class EmployeeMasterResponseDTO {

    Long Id;

    String employeeCode;

    String employeeName;

    DesignationDTO designationMasterId;

    ReportingManagerDTO reportingManagerId;

    LocationDTO locationMasterId;

    Double salary;

    BloodGroup bloodGroup;

    EmployeeBand employeeBand;

    Date doj;

    Date dob;

    String fatherName;

    String motherName;

    private List<EmpAddressDTO> empAddresses = new ArrayList<>();

    String contactNo;

    String note;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class DesignationDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class LocationDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class ReportingManagerDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class EmpAddressDTO {
        private Long id;
        private String code;
        private String name;
    }
}
