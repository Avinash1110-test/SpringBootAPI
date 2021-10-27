package com.hcl.employeemaster.model.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "designation_master", uniqueConstraints = {@UniqueConstraint(columnNames = {"code"}, name = "code_UNIQUE"),
        @UniqueConstraint(columnNames = {"name"}, name = "name_UNIQUE")})
@Getter
@Setter
public class DesignationMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "code", length = 45, nullable = false)
    String code;

    @NotNull
    @Column(name = "name", length = 45, nullable = false)
    String name;
}
