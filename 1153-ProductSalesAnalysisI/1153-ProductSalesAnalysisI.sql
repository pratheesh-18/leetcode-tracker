-- Last updated: 7/8/2026, 3:38:15 PM
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from Sales s 
left join Product p on p.product_id=s.product_id;