alter table DOORS_ORDER add NOTES varchar(max) ;
alter table DOORS_ORDER drop column HEIGHT ;
alter table DOORS_ORDER add HEIGHT integer not null default 0 ;
alter table DOORS_ORDER drop column WIDTH ;
alter table DOORS_ORDER add WIDTH integer not null default 0 ;
