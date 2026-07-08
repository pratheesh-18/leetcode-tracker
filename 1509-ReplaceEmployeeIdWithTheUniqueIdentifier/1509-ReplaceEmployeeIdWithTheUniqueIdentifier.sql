-- Last updated: 7/8/2026, 3:37:09 PM
# Write your MySQL query statement below
select uni.unique_id ,e.name
from Employees e
left join EmployeeUNI uni on uni.id=e.id;