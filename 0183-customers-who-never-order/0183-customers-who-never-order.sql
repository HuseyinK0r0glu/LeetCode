# Write your MySQL query statement below
select name as Customers from customers where id not in 
    (select customerId from customers inner join orders on orders.customerId = customers.id);