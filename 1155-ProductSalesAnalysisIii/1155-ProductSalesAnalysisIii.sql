-- Last updated: 7/8/2026, 3:38:13 PM
select product_id, year as first_year, quantity, price 
from sales where (product_id, year) in (
    select product_id, min(year)
    from sales
    group by product_id
)