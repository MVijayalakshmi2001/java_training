create table vijimbook(book_Number number(5) PRIMARY KEY , book_name VARCHAR2(20),author VARCHAR2(20),price number(7,2));
DESCRIBE vijimbook

create table vijimStudent(roll_number number(3) PRIMARY KEY,student_name VARCHAR2(20),branch VARCHAR2(20),date_of_birth DATE,mark_scored NUMBER(3));
DESCRIBE vijimStudent

CREATE table vijimauthor(phone_number number(10) primary key, first_name VARCHAR2(20),last_name VARCHAR2(20),city VARCHAR2(20),pincode number(6));
DESCRIBE vijimauthor
 
create table vijayabook(book_number number(3) PRIMARY KEY, book_name VARCHAR2(20),price number(10,2), author_ref number(10) REFERENCES vijimauthor(phone_number));
DESCRIBE vijayabook

