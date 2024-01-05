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

INSERT INTO STUDENT(STUDENT_ID, NAME, EMAIL, COURSE)
VALUES (101, 'RAJAN', 'rajan@gmail.com', 'Java');
 
 
 
 
 
 
 
 