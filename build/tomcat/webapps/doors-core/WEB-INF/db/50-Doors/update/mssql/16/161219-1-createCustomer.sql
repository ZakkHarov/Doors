create table DOORS_CUSTOMER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CONTACT_NAME varchar(255),
    ADDRESS varchar(255),
    PHONE varchar(50),
    MOBILE varchar(50),
    FAX varchar(50),
    EMAIL varchar(50),
    SITE varchar(100),
    --
    primary key nonclustered (ID)
);
