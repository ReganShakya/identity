/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  regan
 * Created: May 1, 2020
 */

create table mst_roles(id serial primary key,
role_name varchar(100));

create table tbl_users(id serial primary key, username varchar(100),
password varchar(100), email varhcar(100), role_id bigint unsigned,
created_date timestamp default current_timestamp, modified_date 
timestamp null, status boolean);

alter table tbl_users add foreign key(role_id) references mst_roles(id);

insert into mst_roles(role_name) values('admin'),('user');

insert into tbl_users(username,password,email,role_id,status) 
values('admin','$2a$10$famlt6nQav06BAkfM4Ry8u5SU4bUKv.qUJMl8A/DYQwD1qEmltxBK',
'reganshakya@gmail.com',1,1);