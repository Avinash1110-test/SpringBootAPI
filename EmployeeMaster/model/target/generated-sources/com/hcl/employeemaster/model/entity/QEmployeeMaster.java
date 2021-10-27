package com.hcl.employeemaster.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeMaster is a Querydsl query type for EmployeeMaster
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmployeeMaster extends EntityPathBase<EmployeeMaster> {

    private static final long serialVersionUID = -676623326L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployeeMaster employeeMaster = new QEmployeeMaster("employeeMaster");

    public final QAuditable _super = new QAuditable(this);

    public final EnumPath<com.hcl.employeemaster.model.enums.BloodGroup> bloodGroup = createEnum("bloodGroup", com.hcl.employeemaster.model.enums.BloodGroup.class);

    public final StringPath contactNo = createString("contactNo");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QDesignationMaster designationMaster;

    public final DateTimePath<java.util.Date> dob = createDateTime("dob", java.util.Date.class);

    public final DateTimePath<java.util.Date> doj = createDateTime("doj", java.util.Date.class);

    public final ListPath<EmpAddress, QEmpAddress> empAddresses = this.<EmpAddress, QEmpAddress>createList("empAddresses", EmpAddress.class, QEmpAddress.class, PathInits.DIRECT2);

    public final EnumPath<com.hcl.employeemaster.model.enums.EmployeeBand> employeeBand = createEnum("employeeBand", com.hcl.employeemaster.model.enums.EmployeeBand.class);

    public final StringPath employeeCode = createString("employeeCode");

    public final StringPath employeeName = createString("employeeName");

    public final StringPath fatherName = createString("fatherName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QLocationMaster locationMaster;

    public final StringPath motherName = createString("motherName");

    public final StringPath note = createString("note");

    public final QReportingManagers reportingManager;

    public final NumberPath<Double> salary = createNumber("salary", Double.class);

    public QEmployeeMaster(String variable) {
        this(EmployeeMaster.class, forVariable(variable), INITS);
    }

    public QEmployeeMaster(Path<? extends EmployeeMaster> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmployeeMaster(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmployeeMaster(PathMetadata metadata, PathInits inits) {
        this(EmployeeMaster.class, metadata, inits);
    }

    public QEmployeeMaster(Class<? extends EmployeeMaster> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.designationMaster = inits.isInitialized("designationMaster") ? new QDesignationMaster(forProperty("designationMaster")) : null;
        this.locationMaster = inits.isInitialized("locationMaster") ? new QLocationMaster(forProperty("locationMaster")) : null;
        this.reportingManager = inits.isInitialized("reportingManager") ? new QReportingManagers(forProperty("reportingManager")) : null;
    }

}

