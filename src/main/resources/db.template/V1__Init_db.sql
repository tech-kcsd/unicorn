create table users (
    id         bigserial    not null,
    first_name varchar(255),
    last_name  varchar(255),
    email      varchar(255) not null unique,
    password   varchar(255) not null,
    enabled    boolean      not null,
    primary key (id)
);

create table roles (
    user_id int8 not null,
    roles   varchar(255),
    foreign key (user_id) references users
);

