create table vijimbook(book_Number number(5) PRIMARY KEY , book_name VARCHAR2(20),author VARCHAR2(20),price number(7,2));
DESCRIBE vijimbook

create table vijimStudent(roll_number number(3) PRIMARY KEY,student_name VARCHAR2(20),branch VARCHAR2(20),date_of_birth DATE,mark_scored NUMBER(3));
DESCRIBE vijimStudent

CREATE table vijimauthor(phone_number number(10) primary key, first_name VARCHAR2(20),last_name VARCHAR2(20),city VARCHAR2(20),pincode number(6));
DESCRIBE vijimauthor
 
create table vijayabook(book_number number(3) PRIMARY KEY, book_name VARCHAR2(20),price number(10,2), author_ref number(10) REFERENCES vijimauthor(phone_number));
DESCRIBE vijayabook

<<<<<<< HEAD
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

delete from viji_book101 where book_no=105

update viji_book101 set cost='300',category='rdbms' where book_no=103

rename vijilib_issue to viji_issue

drop table viji_issue

create table viji1_issue(lib_issue_id number(10) PRIMARY KEY, book_no NUMBER(6) REFERENCES viji_book101(book_no),member_id NUMBER(5) REFERENCES viji_member101(member_id),issue_date date ,return_date date)
=======
>>>>>>> refs/remotes/origin/master
