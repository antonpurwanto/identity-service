drop table if exists i_user_group;
drop table if exists i_group_permission;
drop table if exists i_user_password;
drop table if exists i_user;
drop table if exists i_group;
drop table if exists i_permission;

create table i_user (
  id varchar(36),
  username varchar(255) not null,
  fullname varchar(255) not null,
  email varchar(255) not null,
  active boolean not null,
  primary key (id),
  unique (username),
  unique (email)
);

create table i_user_password (
  id varchar(36),
  id_user varchar(36) not null,
  password varchar(255) not null,
  primary key (id),
  unique (id_user),
  foreign key (id_user) references i_user(id)
);

create table i_group (
  id varchar(36),
  name varchar(100) not null,
  description varchar(255),
  primary key (id),
  unique(name)
);

create table i_permission (
  id varchar(36),
  name varchar(100) not null,
  description varchar(255),
  primary key (id),
  unique(name)
);

create table i_user_group (
  id_user varchar(36),
  id_group varchar(36),
  primary key (id_user, id_group),
  foreign key (id_user) references i_user(id),
  foreign key (id_group) references i_group(id)
);

create table i_group_permission (
  id_group varchar(36),
  id_permission varchar(36),
  primary key (id_permission, id_group),
  foreign key (id_permission) references i_permission(id),
  foreign key (id_group) references i_group(id)
);
