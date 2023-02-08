use sakila;
-- # of films rented each year, group by year
select year(rental_date), count(*)
from rental
order by year(rental_date);

desc rental;


-- how many films were rented every month, grouped by month, in 2005? 
-- (one query, group by month(rental_date)).
-- Note that you will only get results for May through August.
select month(rental_date), count(*)
from rental
where year(rental_date)=2005;
group by month(rental_date);
-- having year(rental_date)=2005;
desc customer_list;

-- number of customers for each country
select country, count(*)
from customer_list
group by country;

-- Using the customer_list VIEW, display a summary for the number of customers in each country, limited to those countries with 10 or more customers.
select country, count(*) as num_customers
from customer_list
where notes = ''
group by country;
-- having count(*) >= 10;

-- Using the customer_list VIEW, display a summary for the number of customers in each city, limited to those cities with customers who have a name starting with S.
select city, count(*)
from customer_list
where name like 'S%'
group by city;

create table `order` (
	order_id int auto_increment primary key,
    order_date datetime default now(),
    cust_name varchar(100) not null,
    product_name varchar(50) not null,
    product_price decimal(10,2) not null, 
	quantity integer not null
);