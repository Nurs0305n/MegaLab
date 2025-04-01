insert into train_types(name) values ('Скоростной');
insert into train_types(name) values ('Скорый');
insert into train_types(name) values ('Пассажирский');

insert into trains(train_number, train_type_id) values (12345, 1);
insert into trains(train_number, train_type_id) values (12443, 2);
insert into trains(train_number, train_type_id) values (23512, 3);

insert into carriage_types(name, extra_price) values ('Общий', 0);
insert into carriage_types(name, extra_price) values ('Плацкартный', 0);
insert into carriage_types(name, extra_price) values ('Купе', 500);
insert into carriage_types(name, extra_price) values ('Спальный', 1000);

insert into carriages(carriage_number, carriage_type_id, train_id) values (143,3,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (535,3,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (124,2,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (626,1,1);
insert into carriages(carriage_number, carriage_type_id, train_id) values (722,1,1);

insert into carriages(carriage_number, carriage_type_id, train_id) values (736,4,2);
insert into carriages(carriage_number, carriage_type_id, train_id) values (135,4,2);
insert into carriages(carriage_number, carriage_type_id, train_id) values (678,2,2);
insert into carriages(carriage_number, carriage_type_id, train_id) values (466,2,2);
insert into carriages(carriage_number, carriage_type_id, train_id) values (145,1,2);

insert into carriages(carriage_number, carriage_type_id, train_id) values (657,4,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (735,4,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (151,4,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (513,4,3);
insert into carriages(carriage_number, carriage_type_id, train_id) values (515,2,3);

insert into localities(name) values ('Бишкек');
insert into localities(name) values ('Алматы');
insert into localities(name) values ('Астана');
insert into localities(name) values ('Москва');
insert into localities(name) values ('Балыкчы');
insert into localities(name) values ('Ташкент');