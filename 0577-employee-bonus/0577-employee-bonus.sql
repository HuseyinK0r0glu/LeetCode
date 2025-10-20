# Write your MySQL query statement below
select name,bonus from (select name,bonus from Employee left join Bonus as B on B.empId = Employee.empId) as subquery where bonus is null or bonus < 1000