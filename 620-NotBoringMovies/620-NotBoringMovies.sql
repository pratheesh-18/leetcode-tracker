-- Last updated: 7/8/2026, 3:39:04 PM
# Write your MySQL query statement below
select *from Cinema where id%2!=0 and description!="boring" order by rating desc;