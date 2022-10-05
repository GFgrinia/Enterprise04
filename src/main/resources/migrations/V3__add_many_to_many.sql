create table user_boardgame (
    id bigint auto_increment not null primary key,
    user_id bigint not null,
    boardgame_id bigint not null,
    status varchar (255),
    foreign key (user_id) references user(id),
    foreign key (boardgame_id) references boardgame(id)
);