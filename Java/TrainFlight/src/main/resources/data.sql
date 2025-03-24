insert into train_types(name) values ('Скоростной');
insert into train_types(name) values ('Скорый');
insert into train_types(name) values ('Пассажирский');

insert into trains(train_number, train_type_id) values (12345, 1);
insert into trains(train_number, train_type_id) values (12443, 2);
insert into trains(train_number, train_type_id) values (23512, 1);
insert into trains(train_number, train_type_id) values (53452, 3);
insert into trains(train_number, train_type_id) values (23445, 1);
insert into trains(train_number, train_type_id) values (52545, 2);
insert into trains(train_number, train_type_id) values (34234, 2);
insert into trains(train_number, train_type_id) values (48468, 1);
insert into trains(train_number, train_type_id) values (45325, 3);
insert into trains(train_number, train_type_id) values (64355, 3);
insert into trains(train_number, train_type_id) values (13414, 1);

insert into carriage_types(name, extra_price) values ('Общий', 0);
insert into carriage_types(name, extra_price) values ('Плацкартный', 0);
insert into carriage_types(name, extra_price) values ('Купе', 500);
insert into carriage_types(name, extra_price) values ('Спальный', 1000);

insert into carriages(carriage_number, carriage_type_id, train_id) values (123,1,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (432,2,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (431,1,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (535,4,4);
insert into carriages(carriage_number, carriage_type_id, train_id) values (352,3,4);
insert into carriages(carriage_number, carriage_type_id, train_id) values (878,1,5);
insert into carriages(carriage_number, carriage_type_id, train_id) values (525,3,5);
insert into carriages(carriage_number, carriage_type_id, train_id) values (061,1,6);
insert into carriages(carriage_number, carriage_type_id, train_id) values (628,4,6);
insert into carriages(carriage_number, carriage_type_id, train_id) values (168,3,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (274,2,1);

insert into localities(name) values ('Бишкек');
insert into localities(name) values ('Алматы');
insert into localities(name) values ('Астана');
insert into localities(name) values ('Москва');
insert into localities(name) values ('Балыкчы');
insert into localities(name) values ('Ташкент');