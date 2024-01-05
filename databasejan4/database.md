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
 
 