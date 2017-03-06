-- begin DOORS_CUSTOMER
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
)^
-- end DOORS_CUSTOMER
-- begin DOORS_ORDER
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
    PLACEMENT_CATEGORY integer not null,
    DOOR_ID uniqueidentifier not null,
    PRICE decimal(19, 2) not null,
    HEIGHT integer,
    WIDTH integer,
    OPENING varchar(50) not null,
    NOTES varchar(max),
    ISOLATION_ tinyint,
    PEEPHOLE tinyint,
    TRIM_ tinyint,
    DISMANTLING tinyint,
    LOOP_NUMBER varchar(255) not null,
    TOP_LOCK varchar(255),
    BOTTOM_LOCK varchar(255),
    TOP_ONLAY varchar(255),
    BOTTOM_ONLAY varchar(255),
    HANDLE varchar(255),
    CYLINDER varchar(255),
    INTERNAL_DECORATION varchar(max),
    EXTERNAL_DECORATION varchar(max),
    STATUS integer not null,
    MASTER integer,
    PAYED tinyint,
    --
    primary key nonclustered (ID)
)^
-- end DOORS_ORDER
-- begin DOORS_DOOR
create table DOORS_DOOR (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    KIND integer not null,
    CD varchar(255) not null,
    DESIGNATION varchar(255),
    DESCRIPTION varchar(max),
    --
    primary key nonclustered (ID)
)^
-- end DOORS_DOOR
