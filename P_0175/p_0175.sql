-- Problem 0175 - Combine Two Tables
-- MySQL


-- Table Schema
USE leetcode_problems   -- Use leetcode_problems database
Create table If Not Exists Person (personId int, firstName varchar(255), lastName varchar(255));
Create table If Not Exists Address (addressId int, personId int, city varchar(255), state varchar(255));
Truncate table Person;
insert into Person (personId, lastName, firstName) values ('1', 'Wang', 'Allen');
insert into Person (personId, lastName, firstName) values ('2', 'Alice', 'Bob');
Truncate table Address;
insert into Address (addressId, personId, city, state) values ('1', '2', 'New York City', 'New York');
insert into Address (addressId, personId, city, state) values ('2', '3', 'Leetcode', 'California');


-- Code
SELECT firstName, lastName, city, state FROM Person
LEFT JOIN Address
USING(personId);


-- Drop after run
DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Address;
