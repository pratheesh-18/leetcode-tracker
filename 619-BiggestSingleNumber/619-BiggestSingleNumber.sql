-- Last updated: 7/8/2026, 3:39:06 PM
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;