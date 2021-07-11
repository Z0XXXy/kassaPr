create table KASSA_ROUTE_STATION_LINK (
    STATION_ID varchar(36) not null,
    ROUTE_ID varchar(36) not null,
    primary key (STATION_ID, ROUTE_ID)
);
