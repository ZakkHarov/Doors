alter table DOORS_ORDER add constraint FK_DOORS_ORDER_DOOR foreign key (DOOR_ID) references DOORS_DOOR(ID);
create index IDX_DOORS_ORDER_DOOR on DOORS_ORDER (DOOR_ID);
