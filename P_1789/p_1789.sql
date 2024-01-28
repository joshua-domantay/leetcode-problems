-- Problem 1789 - Primary Department for Each Employee
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Employee (employee_id int, department_id int, primary_flag ENUM('Y','N'));
Truncate table Employee;
insert into Employee (employee_id, department_id, primary_flag) values ('1', '1', 'N');
insert into Employee (employee_id, department_id, primary_flag) values ('2', '1', 'Y');
insert into Employee (employee_id, department_id, primary_flag) values ('2', '2', 'N');
insert into Employee (employee_id, department_id, primary_flag) values ('3', '3', 'N');
insert into Employee (employee_id, department_id, primary_flag) values ('4', '2', 'N');
insert into Employee (employee_id, department_id, primary_flag) values ('4', '3', 'Y');
insert into Employee (employee_id, department_id, primary_flag) values ('4', '4', 'N');

-- Code
SELECT employee_id, department_id FROM Employee
WHERE primary_flag = 'Y'
UNION
SELECT employee_id, department_id FROM Employee
WHERE employee_id IN (
    SELECT employee_id FROM Employee
    GROUP BY employee_id
    HAVING COUNT(employee_id) = 1
)
ORDER BY employee_id;


-- Drop after run
DROP TABLE IF EXISTS Employee;