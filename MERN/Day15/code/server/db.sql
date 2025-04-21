create database task_manager_db;

use task_manager_db;

-- user table
create table user(
    id integer primary key auto_increment,
    firstName varchar(20),
    lastName varchar(20),
    email varchar(50),
    password varchar(100),
    phoneNumber varchar(15),
    isDeleted integer(1) default 0, -- 0: not deleted, 1: deleted
    createdTimestamp DATETIME default CURRENT_TIMESTAMP
);

-- tasks table
create table tasks(
    id integer primary key auto_increment,
    userId integer,
    title varchar(50),
    description text,
    status varchar(20) default 'pending', -- pending, in-progress, completed
    createdTimestamp DATETIME default CURRENT_TIMESTAMP,
    foreign key (userId) references user(id)
);