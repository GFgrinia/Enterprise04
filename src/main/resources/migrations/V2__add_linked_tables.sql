create table login (
                       id bigint not null auto_increment primary key,
                       username varchar(255) not null,
                       password varchar(255) not null
);


create table event (
                       id bigint not null auto_increment primary key,
                       name varchar (255) not null,
                       address_id bigint not null,
                       time timestamp not null,
                       foreign key (address_id) references address(id)
);


create table ticket (
                        id bigint not null auto_increment primary key,
                        user_id bigint not null,
                        event_id bigint not null,
                        foreign key (user_id) references user(id),
                        foreign key (event_id) references event(id)
);