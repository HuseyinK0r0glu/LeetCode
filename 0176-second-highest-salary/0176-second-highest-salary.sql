# Write your MySQL query statement below

Select max(salary) AS secondHighestSalary 
from Employee
where salary < (Select max(salary) from Employee)

