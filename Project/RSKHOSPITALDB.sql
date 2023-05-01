DROP DATABASE IF EXISTS RskHospitalDB;

CREATE DATABASE RskHospitalDB;

use RskHospitalDB;

SHOW TABLES;

create table user(
id int primary key auto_increment,
name varchar(255) not null,
username varchar(255)not null,
password varchar(255)not null,
usertype varchar(255)not null
);

desc user;

insert into user values
(1,'kishore','kishore','kishore@123','Doctor'),
(2,'jaga','jaga','jaga@123','Pharmacist'),
(3,'prithiv','prithiv','prithiv@123','Receptionist'),
(4,'lokesh','lokesh','lokesh@123','Pharmacist'),
(5,'kumar','kumar','kumar@123','Doctor'),
(6,'kalai','kalai','kalai@123','Receptionist');

select * from doctor;

create table Patient(
patientno Varchar(255) primary key,
name varchar(255) not null,
phone int not null,
address varchar(255) not null
);
 
desc Patient;

insert into Patient values('PS001',"kishore R",982973982,"chennai"),
('PS002',"Testing",923342482,"mpk");

select * from Patient;

create table Doctor(
Doctorno Varchar(255) primary key,
name varchar(255) not null,
special varchar(255) not null,
qualification varchar(255) not null,
channelfee int not null,
phone int not null,
room int not null,
log_id int not null
);

desc Doctor;

insert into Doctor values("DS001","Kishore R","CA","MBBS",12000,979728362,1,1);

select * from Doctor;

CREATE TABLE CHANNEL(
channelno varchar(255) primary key,
doctorname varchar(255) not null,
patientname varchar(255) not null,
roomno int not null,
date DATE not null
);

DESC CHANNEL;

insert into channel VALUES ('CH001','DS001','PS002' ,2,'2023-03-03'),
('CH002','DS001','PS001' ,2,'2023-03-03');

select * from channel;

select C.channelno,D.name, P.name,C.roomno,C.date from doctor D inner join channel C on C.doctorname = D.doctorno inner join patient P on C.patientname = P.Patientno where D.log_id = 1 ;

create Table Items(
itemno VARCHAR(255) PRIMARY KEY,
itemname VARCHAR(255) NOT NULL,
description VARCHAR(255) NOT NULL,
sellprice int not null,
buyprice int not null,
qty int not null default 0
);

desc Items;

insert into items values("IT001","Tablet1","Tablet1 DESC", 15 ,3,1200);
insert into items values("IT002","Tablet2","Tablet2 DESC", 10 ,1,2500);
insert into items values("IT003","Tablet3","Tablet3 DESC", 20,4,3000);

select * from items;


create table Prescription(
pid varchar(255) primary key,
channelid varchar(255) not null,
doctorname varchar(255) not null,
detype varchar(255) not null,
description varchar(255) not null
);
SHOW processlist;

desc Prescription; 

select * from prescription;

create table Sales(
id int primary key auto_increment,
date date not null,
subtotal int not null,
pay int not null,
balance int not null
);

DESC sales;

select * from sales;

create table sale_Product(
id int primary key auto_increment,
sales_id int not null,
pro_id varchar(255) not null,
sellprice int not null,
qty int not null,
total int not null
);

desc sale_Product;

select * from sale_Product;




