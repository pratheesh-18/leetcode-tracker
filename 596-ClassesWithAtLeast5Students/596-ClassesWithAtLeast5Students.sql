-- Last updated: 7/8/2026, 3:39:10 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;