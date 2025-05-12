create table students(
    id SERIAL primary key,
    first_name varchar(50) not null default '',
    last_name varchar(50) not null default '',
    email varchar(255) unique not null,
    created_at bigint,
    updated_at bigint
);