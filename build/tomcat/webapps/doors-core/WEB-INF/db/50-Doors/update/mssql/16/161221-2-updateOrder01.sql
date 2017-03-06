-- alter table DOORS_ORDER add DOOR_ID uniqueidentifier ^
-- update DOORS_ORDER set DOOR_ID = <default_value> ;
-- alter table DOORS_ORDER alter column DOOR_ID uniqueidentifier not null ;
alter table DOORS_ORDER add DOOR_ID uniqueidentifier not null ;
alter table DOORS_ORDER drop column TYPE_ ;
