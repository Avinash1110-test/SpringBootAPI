package com.hcl.employeemaster.model.entity;

import com.hcl.employeemaster.model.enums.BloodGroup;
import com.hcl.employeemaster.model.enums.EmployeeBand;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee_master", uniqueConstraints = {@UniqueConstraint(columnNames = {"emp_code"}, name = "emp_code_UNIQUE"),
        @UniqueConstraint(columnNames = {"emp_name"}, name = "emp_name_UNIQUE")})
@Getter
@Setter
public class EmployeeMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "emp_code", length = 8, nullable = false)
    String employeeCode;

    @NotNull
    @Column(name = "emp_name", length = 45, nullable = false)
    String employeeName;

    @OneToOne
    @JoinColumn(name = "designation", foreignKey = @ForeignKey(name = "EMP_DESIGNATION"))
    DesignationMaster designationMaster;

    @OneToOne
    @JoinColumn(name = "reporting_manager", foreignKey = @ForeignKey(name = "EMP_RM"))
    ReportingManagers reportingManager;

    @OneToOne
    @JoinColumn(name = "location", foreignKey = @ForeignKey(name = "EMP_LOCATION"))
    LocationMaster locationMaster;

    @NotNull
    @Column(name = "salary", length = 10, nullable = false)
    Double salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group", nullable = false)
    BloodGroup bloodGroup;

    @Enumerated(EnumType.STRING)
    @Column(name = "band", nullable = false)
    EmployeeBand employeeBand;

    @NotNull
    @Column(name = "doj", nullable = false)
    Date doj;

    @NotNull
    @Column(name = "dob", nullable = false)
    Date dob;

    @NotNull
    @Column(name = "father_name", length = 45, nullable = false)
    String fatherName;

    @NotNull
    @Column(name = "mother_name", length = 45, nullable = false)
    String motherName;

    @NotNull
    @Column(name = "contact_no", length = 10, nullable = false)
    String contactNo;

    @Column(name = "note", length = 500)
    String note;

    @OneToMany(mappedBy = "employeeMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EmpAddress> empAddresses = new ArrayList<>();
}
