package com.hcl.employeemaster.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReportingManagers is a Querydsl query type for ReportingManagers
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReportingManagers extends EntityPathBase<ReportingManagers> {

    private static final long serialVersionUID = 868117506L;

    public static final QReportingManagers reportingManagers = new QReportingManagers("reportingManagers");

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

    public QReportingManagers(String variable) {
        super(ReportingManagers.class, forVariable(variable));
    }

    public QReportingManagers(Path<? extends ReportingManagers> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReportingManagers(PathMetadata metadata) {
        super(ReportingManagers.class, metadata);
    }

}

