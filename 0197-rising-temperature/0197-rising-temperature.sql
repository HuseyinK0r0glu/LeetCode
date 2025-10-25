# Write your MySQL query statement below
select w1.id from Weather as w1 where temperature > (select w2.temperature from Weather as w2 where w2.recordDate = date_sub(w1.recordDate , interval 1 day))