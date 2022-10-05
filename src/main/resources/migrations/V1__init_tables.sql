create table user (
                      id bigint not null auto_increment primary key,
                      login_id bigint not null,
                      first_name varchar(256),
                      second_name varchar(256)
);



create table boardgame(
                          id bigint not null auto_increment primary key,
                          name varchar (255) not null,
                          release_year int
);


create table address (
                         id bigint not null auto_increment primary key,
                         country varchar (45),
                         city varchar (45),
                         street varchar (45),
                         building int
);

