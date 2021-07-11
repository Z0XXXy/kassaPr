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
);