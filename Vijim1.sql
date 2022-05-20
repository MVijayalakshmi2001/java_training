create table vijimbook(book_Number number(5) PRIMARY KEY , book_name VARCHAR2(20),author VARCHAR2(20),price number(7,2));
DESCRIBE vijimbook

create table vijimStudent(roll_number number(3) PRIMARY KEY,student_name VARCHAR2(20),branch VARCHAR2(20),date_of_birth DATE,mark_scored NUMBER(3));
DESCRIBE vijimStudent

CREATE table vijimauthor(phone_number number(10) primary key, first_name VARCHAR2(20),last_name VARCHAR2(20),city VARCHAR2(20),pincode number(6));
DESCRIBE vijimauthor
 
create table vijayabook(book_number number(3) PRIMARY KEY, book_name VARCHAR2(20),price number(10,2), author_ref number(10) REFERENCES vijimauthor(phone_number));
DESCRIBE vijayabook

DESCRIBE vijiproduct

select * from vijiproduct

describe viji_book

drop table viji_member

create table viji1_memeber(membership_id number(5) primary key,membername varchar2(20),membership_type varchar2(20));
check(membership_type='lifetime' or membership_type='annual' or membership_type='halfyearly' or membership_type='quaterly');


alter table viji1_memeber modify(membername varchar(30));

describe viji1_memeber

alter table viji_issue add(reference char(30));

describe viji_issue


alter table viji_issue drop column reference

describe viji_issue

rename viji_issue to vijilib_issue

insert into viji1_memeber values('1','richasharma','lifetime','pune','10-Dec-05','250','5','50');

describe viji1_memeber

alter table viji1_memeber modify(membername varchar(10));

describe viji1_memeber

create table viji_member101 as select * from viji1_memeber

describe viji_member101

drop table viji_books

create table viji_book101 as SELECT * FROM viji1_books

SELECT * FROM  viji_book101

create table viji_book102 as select* from viji_book101

delete from viji_book101 where book_no=105

update viji_book101 set cost='300',category='rdbms' where book_no=103

rename vijilib_issue to viji_issue

drop table viji_issue

create table viji1_issue101(lib_issue_id number(10) PRIMARY KEY, book_no NUMBER(6,0) REFERENCES viji_book102(BOOK_NO),membership_id NUMBER(5,0) REFERENCES viji_member101(MEMBERSHIP_ID),issue_date date,return_date date,check (issue_date < return_date))

INSERT INTO viji1_issue101 values ('504','4','6','10-Dec-2022','11-Dec-2023')
  
select * from viji1_issue101

DELETE FROM viji1_issue101 WHERE lib_issue_id = 504

delete from viji_member101 where membership_id = 1

UPDATE viji1_issue101 SET return_date=(issue_date+15) WHERE lib_issue_id=501 OR lib_issue_id=502

UPDATE viji_member101 set penalty=100 WHERE membername='garimasen'


DELETE FROM viji1_issue101 WHERE membership_id = 2 AND issue_date > '21-04-2022 '

DELETE FROM viji1_books WHERE category!='database' AND category!='rdbms'

select * from viji_passenger

select * from viji_trip_history

 drop table viji_trip_history
 
 drop table viji_passenger


CREATE TABLE viji_users1(user_name VARCHAR(20) NOT NULL, password VARCHAR(200) DEFAULT NULL,
enabled VARCHAR(10) DEFAULT NULL,PRIMARY KEY(user_name));

select * from viji_users1

drop table viji_users1

drop table viji_authorities

CREATE TABLE viji_authorities(user_name VARCHAR2(50) NOT NULL,authority VARCHAR2(50) NOT NULL,KEY fk_viji_authorities_viji_users1(user_name),
CONSTRAINT fk_viji_authorities_viji_users1 FOREIGN KEY(user_name) REFERENCES viji_users1(user_name))


CREATE TABLE viji_authorities(user_name varchar(50) NOT NULL, authority varchar(50) NOT NULL,constraint viji_authorities_users
foreign key(user_name) REFERENCES viji_users1 (user_name))


create table viji_users(username varchar(20) not null,password varchar(200) default null, enabled varchar(10) default null,
Primary key (username));

create table viji_authorities(username varchar(50) not null,authority varchar(50) not null,
constraint fk_viji_authorities_users foreign key(username) references viji_users(username));

select * from viji_credit_card
