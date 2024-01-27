-- Problem 0182 - Duplicate Emails
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Person (id int, email varchar(255));
Truncate table Person;
insert into Person (id, email) values ('1', 'a@b.com');
insert into Person (id, email) values ('2', 'c@d.com');
insert into Person (id, email) values ('3', 'a@b.com');


-- Code
SELECT * FROM Person;


-- Drop after run
DROP TABLE IF EXISTS Person;
