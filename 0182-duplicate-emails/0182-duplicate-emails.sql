# Write your MySQL query statement below
select distinct t.email from Person t,Person p where p.email = t.email and t.id != p.id; 