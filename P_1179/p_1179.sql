-- Problem 1179 - Reformat Department Table
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Department (id int, revenue int, month varchar(5));
Truncate table Department;
insert into Department (id, revenue, month) values ('1', '8000', 'Jan');
insert into Department (id, revenue, month) values ('2', '9000', 'Jan');
insert into Department (id, revenue, month) values ('3', '10000', 'Feb');
insert into Department (id, revenue, month) values ('1', '7000', 'Feb');
insert into Department (id, revenue, month) values ('1', '6000', 'Mar');

-- Code
SELECT DISTINCT t1.id,
       jan.revenue AS Jan_Revenue,
       feb.revenue AS Feb_Revenue,
       mar.revenue AS Mar_Revenue,
       apr.revenue AS Apr_Revenue,
       may.revenue AS May_Revenue,
       jun.revenue AS Jun_Revenue,
       jul.revenue AS Jul_Revenue,
       aug.revenue AS Aug_Revenue,
       oct.revenue AS Oct_Revenue,
       sep.revenue AS Sep_Revenue,
       nov.revenue AS Nov_Revenue,
       `dec`.revenue AS Dec_Revenue
FROM Department
AS t1
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Jan'
) AS jan
ON t1.id = jan.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Feb'
) AS feb
ON t1.id = feb.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Mar'
) AS mar
ON t1.id = mar.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Apr'
) AS apr
ON t1.id = apr.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'May'
) AS may
ON t1.id = may.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Jun'
) AS jun
ON t1.id = jun.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Jul'
) AS jul
ON t1.id = jul.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Aug'
) AS aug
ON t1.id = aug.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Sep'
) AS sep
ON t1.id = sep.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Oct'
) AS oct
ON t1.id = oct.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Nov'
) AS nov
ON t1.id = nov.id
LEFT JOIN (
    SELECT id, revenue, month
    FROM Department
    WHERE month = 'Dec'
) AS `dec`
ON t1.id = `dec`.id;


-- Drop after run
DROP TABLE IF EXISTS Department;
