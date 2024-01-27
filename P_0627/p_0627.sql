-- Problem 0627 - Swap Salary
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Salary (id int, name varchar(100), sex char(1), salary int);
Truncate table Salary;
insert into Salary (id, name, sex, salary) values ('1', 'A', 'm', '2500');
insert into Salary (id, name, sex, salary) values ('2', 'B', 'f', '1500');
insert into Salary (id, name, sex, salary) values ('3', 'C', 'm', '5500');
insert into Salary (id, name, sex, salary) values ('4', 'D', 'f', '500');


-- Code
UPDATE Salary
SET sex = CASE WHEN sex = 'm' THEN 'f'
               ELSE 'm' END;
SELECT * FROM Salary;


-- Drop after run
DROP TABLE IF EXISTS Salary;
