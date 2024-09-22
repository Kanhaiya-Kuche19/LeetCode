select s.product_id, s.year AS first_year, s.quantity, s.price
from Sales s
inner join Product p on s.product_id = p.product_id
where (s.product_id, s.year) in (
    select product_id, MIN(year) as first_year
    from Sales
    group by product_id
)
order by s.product_id;
