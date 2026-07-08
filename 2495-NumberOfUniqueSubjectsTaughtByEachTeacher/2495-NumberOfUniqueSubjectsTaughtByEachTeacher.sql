-- Last updated: 7/8/2026, 3:35:16 PM
# Write your MySQL query statement below
Select  teacher_id ,
count(distinct subject_id ) as cnt from Teacher
group by teacher_id