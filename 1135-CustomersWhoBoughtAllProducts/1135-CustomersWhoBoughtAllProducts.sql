-- Last updated: 7/8/2026, 3:38:21 PM
/* Write your T-SQL query statement below */
SELECT
     customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key)=(SELECT
                                         COUNT(*)
                                    FROM Product)