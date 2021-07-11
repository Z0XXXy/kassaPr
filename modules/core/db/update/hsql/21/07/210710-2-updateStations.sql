alter table KASSA_STATIONS alter column ROUTES_ID rename to ROUTES_ID__U21437 ^
alter table KASSA_STATIONS drop constraint FK_KASSA_STATIONS_ON_ROUTES ;
drop index IDX_KASSA_STATIONS_ON_ROUTES ;
