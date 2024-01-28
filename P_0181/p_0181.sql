-- Problem 181 - Employees Earning More Than Their Managers
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Employee (id int, name varchar(255), salary int, managerId int);
Truncate table Employee;
insert into Employee (id, name, salary, managerId) values (1, 'Joe', '70000', 3);
insert into Employee (id, name, salary, managerId) values (2, 'Henry', '80000', 4);
insert into Employee (id, name, salary, managerId) values (3, 'Sam', '60000', Null);
insert into Employee (id, name, salary, managerId) values (4, 'Max', '90000', Null);

-- Code
SELECT * FROM Employee;


-- Drop after run
DROP TABLE IF EXISTS Employee;
