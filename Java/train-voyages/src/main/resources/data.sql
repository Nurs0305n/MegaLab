insert into train_types(id, name) values(1, 'Скоростной');
insert into train_types(id, name) values(2, 'Cкорый');
insert into train_types(id, name) values(3, 'Пассажирский');

insert into trains(id, train_number, train_type_id) values(1, 12345, 1);
insert into trains(id, train_number, train_type_id) values(2, 23456, 2);
insert into trains(id, train_number, train_type_id) values(3, 34567, 3);
insert into trains(id, train_number, train_type_id) values(4, 45678, 1);

insert into carriage_types(id, name, extra_price) values(1, 'Общий', 0);
insert into carriage_types(id, name, extra_price) values(2, 'Плацкартный', 0);
insert into carriage_types(id, name, extra_price) values(3, 'Купе', 500);
insert into carriage_types(id, name, extra_price) values(4, 'Спальный', 1000);

insert into carriages(id, carriage_number, carriage_type_id, train_id) values(1, 123, 1, 1);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(2, 234, 1, 1);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(3, 345, 3, 1);

insert into carriages(id, carriage_number, carriage_type_id, train_id) values(4, 456, 1, 2);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(5, 56, 1, 2);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(6, 678, 3, 2);

insert into carriages(id, carriage_number, carriage_type_id, train_id) values(7, 567, 1, 3);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(8, 678, 3, 3);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(9, 789, 4, 3);

insert into carriages(id, carriage_number, carriage_type_id, train_id) values(10,987, 3, 4);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(11, 86, 3, 4);
insert into carriages(id, carriage_number, carriage_type_id, train_id) values(12, 765, 4, 4);

insert into localities(id, name) values(1, 'Бишкек');
insert into localities(id, name) values(2, 'Москва');
insert into localities(id, name) values(3, 'Балыкчы');
insert into localities(id, name) values(4, 'Алматы');