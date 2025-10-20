# Write your MySQL query statement below
select name as Customers from customers as c where c.id not in (select o.customerId from orders as o where c.id = o.customerId) 