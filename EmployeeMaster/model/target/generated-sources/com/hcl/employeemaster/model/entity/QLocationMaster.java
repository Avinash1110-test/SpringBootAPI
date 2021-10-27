package com.hcl.employeemaster.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLocationMaster is a Querydsl query type for LocationMaster
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLocationMaster extends EntityPathBase<LocationMaster> {

    private static final long serialVersionUID = -2081086487L;

    public static final QLocationMaster locationMaster = new QLocationMaster("locationMaster");

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

    public QLocationMaster(String variable) {
        super(LocationMaster.class, forVariable(variable));
    }

    public QLocationMaster(Path<? extends LocationMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocationMaster(PathMetadata metadata) {
        super(LocationMaster.class, metadata);
    }

}

