-- begin DOORS_ORDER
alter table DOORS_ORDER add constraint FK_DOORS_ORDER_CUSTOMER foreign key (CUSTOMER_ID) references DOORS_CUSTOMER(ID)^
alter table DOORS_ORDER add constraint FK_DOORS_ORDER_DOOR foreign key (DOOR_ID) references DOORS_DOOR(ID)^
create index IDX_DOORS_ORDER_CUSTOMER on DOORS_ORDER (CUSTOMER_ID)^
create index IDX_DOORS_ORDER_DOOR on DOORS_ORDER (DOOR_ID)^
-- end DOORS_ORDER
