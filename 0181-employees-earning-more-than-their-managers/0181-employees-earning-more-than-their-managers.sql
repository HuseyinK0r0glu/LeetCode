# Write your MySQL query statement below
# Select a.name as Employee from Employee as a where salary > (select salary from Employee where id = a.managerId);
select e.name as Employee from employee as e join Employee as m on m.id = e.managerId where e.salary > m.salary;