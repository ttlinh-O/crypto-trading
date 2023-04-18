create table wallet
(
    account_id  UUID not null primary key,
    amount      DECIMAL(10,2) not null
);

create table transaction
(
    id                      UUID not null primary key,
    account_id              UUID not null,
    transaction_type        character(255) not null,
    transaction_date        timestamp not null,
    symbol                  character(255) not null,
    description             VARCHAR(255),
    amount                  DECIMAL(10,2) not null
);

