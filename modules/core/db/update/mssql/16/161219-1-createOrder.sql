create table DOORS_ORDER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(20) not null,
    DATE_ datetime2 not null,
    CUSTOMER_ID uniqueidentifier not null,
    MANUFACTURE_DATE datetime2 not null,
    --
    primary key nonclustered (ID)
);
