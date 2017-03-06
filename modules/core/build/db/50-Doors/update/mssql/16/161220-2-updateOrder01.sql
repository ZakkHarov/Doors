update DOORS_ORDER set HEIGHT = 0 where HEIGHT is null ;
alter table DOORS_ORDER alter column HEIGHT decimal(19, 2) not null ;
update DOORS_ORDER set WIDTH = 0 where WIDTH is null ;
alter table DOORS_ORDER alter column WIDTH decimal(19, 2) not null ;
update DOORS_ORDER set OPENING = '1' where OPENING is null ;
alter table DOORS_ORDER alter column OPENING varchar(50) not null ;
