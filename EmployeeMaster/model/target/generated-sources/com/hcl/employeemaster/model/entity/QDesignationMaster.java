package com.hcl.employeemaster.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDesignationMaster is a Querydsl query type for DesignationMaster
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDesignationMaster extends EntityPathBase<DesignationMaster> {

    private static final long serialVersionUID = -1653388665L;

    public static final QDesignationMaster designationMaster = new QDesignationMaster("designationMaster");

    public final QAuditable _super = new QAuditable(this);

    public final StringPath code = createString("code");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public QDesignationMaster(String variable) {
        super(DesignationMaster.class, forVariable(variable));
    }

    public QDesignationMaster(Path<? extends DesignationMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDesignationMaster(PathMetadata metadata) {
        super(DesignationMaster.class, metadata);
    }

}

