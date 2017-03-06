alter table DOORS_ORDER alter column PRICE decimal(19, 2) ;
update DOORS_ORDER set PRICE = 0 where PRICE is null ;
alter table DOORS_ORDER alter column PRICE decimal(19, 2) not null ;
