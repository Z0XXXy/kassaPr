-- begin KASSA_ROUTE
create table KASSA_ROUTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(36) not null,
    TRANSPORT varchar(50) not null,
    --
    primary key (ID)
)^
-- end KASSA_ROUTE
-- begin KASSA_STATIONS
create table KASSA_STATIONS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATION_NAME varchar(255) not null,
    DURATION integer not null,
    --
    primary key (ID)
)^
-- end KASSA_STATIONS
-- begin KASSA_TICKET
create table KASSA_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TICKET_NUMBER varchar(36) not null,
    DEPARTURE_ID varchar(36) not null,
    START_TIME timestamp not null,
    ARRIVAL_ID varchar(36) not null,
    ARRIVAL_TIME timestamp not null,
    TRANSPORT varchar(50) not null,
    TIKETS_PASSENGER_ID varchar(36) not null,
    PRICE integer not null,
    TIKET_TRAVELS_ID varchar(36),
    --
    primary key (ID)
)^
-- end KASSA_TICKET
-- begin KASSA_PASSANGER
create table KASSA_PASSANGER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    PASSPORT_SERIAL_NUM bigint not null,
    --
    primary key (ID)
)^
-- end KASSA_PASSANGER
-- begin KASSA_TRAVEL
create table KASSA_TRAVEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TRAVEL_PASSENGER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end KASSA_TRAVEL
-- begin KASSA_ROUTE_STATION_LINK
create table KASSA_ROUTE_STATION_LINK (
    STATION_ID varchar(36) not null,
    ROUTE_ID varchar(36) not null,
    primary key (STATION_ID, ROUTE_ID)
)^
-- end KASSA_ROUTE_STATION_LINK
