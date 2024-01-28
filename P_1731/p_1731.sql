-- Problem 1731 - The Number of Employees Which Report to Each Employee
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Employees(employee_id int, name varchar(20), reports_to int, age int);
Truncate table Employees;
insert into Employees (employee_id, name, reports_to, age) values (9, 'Hercy', null, 43);
insert into Employees (employee_id, name, reports_to, age) values (6, 'Alice', 9, 41);
insert into Employees (employee_id, name, reports_to, age) values (4, 'Bob', 9, 36);
insert into Employees (employee_id, name, reports_to, age) values (2, 'Winston', null, 37);

-- Code
SELECT * FROM Employees;


-- Drop after run
DROP TABLE IF EXISTS Employees;
