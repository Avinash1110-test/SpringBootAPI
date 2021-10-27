package com.hcl.employeemaster.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmpAddress is a Querydsl query type for EmpAddress
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmpAddress extends EntityPathBase<EmpAddress> {

    private static final long serialVersionUID = -1786639234L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmpAddress empAddress = new QEmpAddress("empAddress");

    public final QAuditable _super = new QAuditable(this);

    public final StringPath address = createString("address");

    public final EnumPath<com.hcl.employeemaster.model.enums.AddressType> addressType = createEnum("addressType", com.hcl.employeemaster.model.enums.AddressType.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEmployeeMaster employeeMaster;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath phone_no = createString("phone_no");

    public QEmpAddress(String variable) {
        this(EmpAddress.class, forVariable(variable), INITS);
    }

    public QEmpAddress(Path<? extends EmpAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmpAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmpAddress(PathMetadata metadata, PathInits inits) {
        this(EmpAddress.class, metadata, inits);
    }

    public QEmpAddress(Class<? extends EmpAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employeeMaster = inits.isInitialized("employeeMaster") ? new QEmployeeMaster(forProperty("employeeMaster"), inits.get("employeeMaster")) : null;
    }

}

