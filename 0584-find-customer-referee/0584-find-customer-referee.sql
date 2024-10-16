# Write your MySQL query statement below
Select name from Customer where referee_id not in (select referee_id where referee_id = 2);