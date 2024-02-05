-- Problem 584 - Find Customer Referee
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Customer (id int, name varchar(25), referee_id int);
Truncate table Customer;
insert into Customer (id, name, referee_id) values (1, 'Will', null);
insert into Customer (id, name, referee_id) values (2, 'Jane', null);
insert into Customer (id, name, referee_id) values (3, 'Alex', 2);
insert into Customer (id, name, referee_id) values (4, 'Bill', null);
insert into Customer (id, name, referee_id) values (5, 'Zack', 1);
insert into Customer (id, name, referee_id) values (6, 'Mark', 2);

-- Code
SELECT * FROM Customer;


-- Drop after run
DROP TABLE IF EXISTS Customer;
