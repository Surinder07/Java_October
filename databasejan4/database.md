-- to list the database present
show databases; --  cmd + enter
-- schema : Employee , table : EMPLOYEE, SALARY, DEPT_MANAGER, TITLES
create database mobile;

show tables;

-- to fetch all the records from table
Select * from EMPLOYEE;

-- To fetch all the records from salary table
Select * from SALARY;
Select * from TITLES;
SELECT * FROM DEPT_MANAGER;

-- Fetch required columns only
SELECT EMPLOYEE_ID, EMPLOYEE_NAME
FROM EMPLOYEE;

-- DISTINCT
SELECT DISTINCT EMPLOYEE_ADDRESS FROM EMPLOYEE;

-- FILTER EMPLOYEES FROM JAPAN  
SELECT * FROM EMPLOYEE
WHERE EMPLOYEE_ADDRESS = 'JAPAN';

-- sort in order  Order by
SELECT * FROM EMPLOYEE
ORDER BY
EMPLOYEE_ADDRESS desc;

-- AND / OR
SELECT * FROM EMPLOYEE
WHERE
EMPLOYEE_NAME = 'JOHN' OR EMPLOYEE_ADDRESS = 'CANADA';

-- NOT
SELECT * FROM EMPLOYEE WHERE NOT EMPLOYEE_NAME = 'JOHN';

-- DISTNIC, AND OR NOT , ORDER BY, SELECT , WHERE

-- PUT A LIMIT TO THE NUMBER OF RECORDS
SELECT * FROM EMPLOYEE LIMIT 3;


-- Some database operations
-- delete a database
drop database aprinder;

show databases;

-- tables
-- create, delete, update, insert into table
SHOW TABLES;

CREATE TABLE STUDENT(
STUDENT_ID int,
NAME VARCHAR(255),
EMAIL VARCHAR(255),
COURSE VARCHAR(255));

SELECT * FROM STUDENT;

-- insert record in the table
INSERT INTO STUDENT(STUDENT_ID, NAME, EMAIL, COURSE)
VALUES (NULL, 'RAJAN', 'rajan@gmail.com', 'Java');

-- update a record
UPDATE STUDENT
SET NAME = 'Pragra'
WHERE STUDENT_ID = 0;

-- constraints

CREATE TABLE STUDENT25(
STUDENT_ID int PRIMARY KEY ,
NAME VARCHAR(255) NOT NULL,
EMAIL VARCHAR(255) UNIQUE,
COURSE VARCHAR(255) NOT NULL);

SELECT * FROM STUDENT25;

INSERT INTO STUDENT5(STUDENT_ID, NAME, EMAIL, COURSE)
VALUES (1, 'Sachin', 'surinder@gmail.com', 'test');


UPDATE STUDENT5
SET NAME = 'Pragra'
WHERE STUDENT_ID = 1;


-- ALTER A COLUMN AND ADD A NEW COLUMN
ALTER TABLE STUDENT ADD AGE VARCHAR(255);

SELECT * FROM STUDENT;

CREATE TABLE STUDENT101(
STUDENT_ID int PRIMARY KEY auto_increment ,
NAME VARCHAR(255) NOT NULL,
EMAIL VARCHAR(255) UNIQUE,
COURSE VARCHAR(255) NOT NULL,
AGE INT
CHECK (AGE > 1)
);

SELECT * FROM STUDENT101;

INSERT INTO STUDENT101(STUDENT_ID, NAME, EMAIL, COURSE, AGE)
VALUES (1, 'Sachin', 'surinder@gmail.com', 'test', 10);

-- AUTO INCREMENT 
 
 
 
 ======PART 2 =====

SHOW DATABASES;
USE Employee;
show tables;

-- delete all the tables named as Student*
drop table Persons;

-- functions
-- min

select * from EMPLOYEE;
SELECT MIN(EMPLOYEE_SALARY)
FROM EMPLOYEE;

SELECT MAX(EMPLOYEE_SALARY)
FROM EMPLOYEE;

-- COUNT
SELECT COUNT(EMPLOYEE_SALARY)
FROM EMPLOYEE
WHERE EMPLOYEE_SALARY > 40000 AND EMPLOYEE_ADDRESS = 'JAPAN';

-- CAN YOU FIND EMPLOYEES FROM JAPAN AND SALARY GREATER THAN 50K

------
## Database January 11 , 2024
-- recap
-- connected the database aws - rds
-- create tables, create database, CRUD from tables , AND OR
-- constraints


show databases;
use Employee;

show tables;

select * from EMPLOYEE;
select * from SALARY;
select * from DEPT_MANAGER;
select * from TITLES;



-- functions
-- MIN
-- return min salary from the salary table
select MIN(EMPLOYEE_SALARY) from EMPLOYEE;

-- MAX
select MAX(EMPLOYEE_SALARY) from EMPLOYEE;


-- COUNT
select COUNT(EMPLOYEE_SALARY) from EMPLOYEE
where EMPLOYEE_SALARY > 50000;

-- how many employess are there
select COUNT(*) from EMPLOYEE;

-- SUM
select SUM(EMPLOYEE_SALARY) from EMPLOYEE;

-- AVG
select AVG(EMPLOYEE_SALARY) from EMPLOYEE;

-- 2-3 interview questins, can you get the maximum salary from employee table?
-- second highest salary
-- do you know about joins,

-- create a Student_ table,
-- id, name , email, age, marks
--  add upto  5 records
--  find the students with highest marks,
-- find the average age of students
--  find the number of students with marks greater than 90

-- 1, "Arpinder", "email", "25", 90
--                      26 , 80 , 95


-- select * from STUDENT_ARPINDER;
-- insert into STUDENT_ARPINDER (id, name, email, age, marks)
-- values (1001, 'Mike', 'mike@gmail.com', 25, 87);


  