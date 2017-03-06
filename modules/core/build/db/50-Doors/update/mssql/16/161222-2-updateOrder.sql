-- update DOORS_ORDER set DOOR_ID = <default_value> where DOOR_ID is null ;
alter table DOORS_ORDER alter column DOOR_ID uniqueidentifier not null ;
