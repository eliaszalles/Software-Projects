use sakila;
create database annandale_cupcakes;
use annandale_cupcakes;

create table `customer` (
    customer_id int primary key auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    phone_number varchar(20),
    email varchar(30),
    street varchar(100),
    city varchar(50),
    state varchar(25),
    zip varchar(10),
    notes varchar(255),
    created_at datetime,
    updated_at datetime
);
        
create table `customer_note` (
	note_id int primary key auto_increment,
    subject varchar(50),
    note text -- varchar(255),
	customer_id int, -- FK referencing customer
    created_at datetime,
    updated_at datetime
);

create table `event` (
    event_id int primary key auto_increment,
	customer_id int,
    order_id int, -- FK referencing order
    event_datetime datetime,
    bake_order_datetime datetime,
    description varchar(255),
    delivery_instructions varchar(255),
    notes varchar(255)
);

create table `payment` (
	payment_id int primary key auto_increment,
    payment_method varchar(50),
    amount decimal(19,2),
    notes varchar(255),
    sale_id int, -- FK referencing sale
	created_at datetime,
    updated_at datetime
);

create table `product` (
	product_id int primary key auto_increment,
    cupcake_type varchar(25),
    cupcake_name varchar(25),  
    price decimal(5,2),
    cost_per_unit decimal(5,2),
    notes text,
    unit_capacity_per_day int,
    created_at datetime,
    updated_at datetime
);

create table `sale` (
	sale_id int primary key auto_increment,
    sale_date date,
    notes varchar(255),
    created_at datetime,
    updated_at datetime
);

create table `sale_item` (
	sale_item_id int primary key auto_increment,
	sale_id int, -- FK referencing sale table 
	product_id int, -- FK referencing product table,
    quantity int default 0,
    created_at datetime,
    updated_at datetime
);

