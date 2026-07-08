-- Last updated: 7/8/2026, 3:37:52 PM
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;