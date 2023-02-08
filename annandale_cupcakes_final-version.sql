drop schema if exists `annandale_cupcakes`;

create database annandale_cupcakes;
use annandale_cupcakes;

create table customer (
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

create table customer_note (
	note_id int primary key auto_increment,
	subject varchar(50),
	note varchar(255),
	customer_id int,
	created_at datetime,
	updated_at datetime
);

create table event (
	event_id int primary key auto_increment,
	customer_id int,
	order_id int,
	event_datetime datetime,
	bake_order_datetime datetime,
	description varchar(100),
	delivery_instructions varchar(100),
	notes varchar(255)
);

create table payment (
	payment_id int primary key auto_increment,
	sale_id int,
	payment_method varchar(20),
	amount decimal(7,2),
	notes varchar(255),
	created_at datetime, 
	updated_at datetime
);

create table product (
	product_id int primary key auto_increment,
	cupcake_type varchar(50),
	cupcake_name varchar(50),
	price decimal(7,2),
	cost_per_unit decimal(7,2),
	unit_capacity_per_day int,
	notes text,
	created_at datetime,
	updated_at datetime
);

create table sale (
	sale_id int primary key auto_increment,
	customer_id int,
	sale_date datetime,
	notes text,
	created_at datetime,
	updated_at datetime
);

create table sale_item (
	sale_item_id int primary key auto_increment,
	sale_id int,
	product_id int,
	quantity int,
	created_at datetime,
	updated_at datetime
);