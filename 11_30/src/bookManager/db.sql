-- 建表建库文件，单独写到SQL文件
create database java101BookManager;
use  java101BookManager;

-- 创建表
drop table if exists book;
drop table if exists user;

create table book(
    bookId int primary key auto_increment,
    name varchar(20),
    author varchar(50),
    price int,
    type varchar(50),
    -- 1-已借出 0-未借出
    isBorrowed int
);

create table user(
    userId int primary key auto_increment,
    name varchar(50) unique,
    password varchar(20),
    -- 0不是管理员，1是管理员
    isAdmin int
);

insert into book values(null,'西游记','吴承恩',10000,'古典名著',0);
insert into book values(null,'三国演义','罗贯中',10001,'古典名著',0);
insert into book values(null,'金瓶梅','兰陵笑笑生',20000,'古典名著',0);

insert into user values(null,'admin','123',1);
insert into user values(null,'zhangsan','123',0);

/*
mysql> use java101BookManager;
Database changed
mysql> show tables;
+------------------------------+
| Tables_in_java101bookmanager |
+------------------------------+
| book                         |
| user                         |
+------------------------------+
2 rows in set (0.00 sec)

mysql> select * from book;
+--------+--------------+-----------------+-------+--------------+------------+
| bookId | name         | author          | price | type         | isBorrowed |
+--------+--------------+-----------------+-------+--------------+------------+
|      1 | 西游记       | 吴承恩          | 10000 | 古典名著     |          0 |
|      2 | 三国演义     | 罗贯中          | 10001 | 古典名著     |          0 |
|      3 | 金瓶梅       | 兰陵笑笑生      | 20000 | 古典名著     |          0 |
+--------+--------------+-----------------+-------+--------------+------------+
3 rows in set (0.00 sec)

mysql> select * from user;
+--------+----------+----------+---------+
| userId | name     | password | isAdmin |
+--------+----------+----------+---------+
|      1 | admin    | 123      |       1 |
|      2 | zhangsan | 123      |       0 |
+--------+----------+----------+---------+
2 rows in set (0.00 sec)
*/

