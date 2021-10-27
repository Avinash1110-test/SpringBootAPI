package com.hcl.employeemaster.model.entity;

import com.hcl.employeemaster.model.enums.AddressType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "emp_address")
@Getter
@Setter
public class EmpAddress extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false)
    AddressType addressType;

    @NotNull
    @Column(name = "address", length = 500, nullable = false)
    String address;

    @NotNull
    @Column(name = "phone_no", length = 45, nullable = false)
    String phone_no;

    @ManyToOne
    @JoinColumn(name = "emp_id", foreignKey = @ForeignKey(name = "EMP_MASTER_ID"))
    private EmployeeMaster employeeMaster;
}
