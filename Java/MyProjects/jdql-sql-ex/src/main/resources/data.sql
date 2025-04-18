----products(maker,model,type)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into products(maker,model,type) values('B','1121','PC');
insert into products(maker,model,type) values('A','1232','PC');
insert into products(maker,model,type) values('A','1233','PC');
insert into products(maker,model,type) values('E','1260','PC');
insert into products(maker,model,type) values('A','1276','Printer');
insert into products(maker,model,type) values('D','1288','Printer');
insert into products(maker,model,type) values('A','1298','Laptop');
insert into products(maker,model,type) values('C','1321','Laptop');
insert into products(maker,model,type) values('A','1401','Printer');
insert into products(maker,model,type) values('A','1408','Printer');
insert into products(maker,model,type) values('D','1433','Printer');
insert into products(maker,model,type) values('E','1434','Printer');
insert into products(maker,model,type) values('B','1750','Laptop');
insert into products(maker,model,type) values('A','1752','Laptop');
insert into products(maker,model,type) values('E','2113','PC');
insert into products(maker,model,type) values('E','2112','PC');

----PC------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into pcs(code, model, speed, ram, hd, cd, price) values(1,'1232',500,64,5,'12x','600');
insert into pcs(code, model, speed, ram, hd, cd, price) values(2,'1121',750,128,14,'40x','850');
insert into pcs(code, model, speed, ram, hd, cd, price) values(3,'1233',500,64,5,'12x','600');
insert into pcs(code, model, speed, ram, hd, cd, price) values(4,'1121',600,128,14,'40x','850');
insert into pcs(code, model, speed, ram, hd, cd, price) values(5,'1121',600,128,8,'40x','850');
insert into pcs(code, model, speed, ram, hd, cd, price) values(6,'1233',750,128,20,'50x','950');
insert into pcs(code, model, speed, ram, hd, cd, price) values(7,'1232',500,32,10,'12x','400');
insert into pcs(code, model, speed, ram, hd, cd, price) values(8,'1232',450,64,8,'24x','350');
insert into pcs(code, model, speed, ram, hd, cd, price) values(9,'1232',450,32,10,'24x','350');
insert into pcs(code, model, speed, ram, hd, cd, price) values(10,'1260',500,32,10,'12x','350');
insert into pcs(code, model, speed, ram, hd, cd, price) values(11,'1233',900,128,40,'40x','980');
insert into pcs(code, model, speed, ram, hd, cd, price) values(12,'1233',800,128,20,'50x','970');


----Laptop------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into laptops(code, model, speed, ram, hd, price, screen) values(1,'1298',350,32,4,'700',11);
insert into laptops(code, model, speed, ram, hd, price, screen) values(2,'1321',500,64,8,'970',12);
insert into laptops(code, model, speed, ram, hd, price, screen) values(3,'1750',750,128,12,'1200',14);
insert into laptops(code, model, speed, ram, hd, price, screen) values(4,'1298',600,64,10,'1050',15);
insert into laptops(code, model, speed, ram, hd, price, screen) values(5,'1752',750,128,10,'1150',14);
insert into laptops(code, model, speed, ram, hd, price, screen) values(6,'1298',450,64,10,'950',12);


----Printer------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into printers(code, model, color, type, price)  values(1,'1276','n','Laser','400');
insert into printers(code, model, color, type, price)  values(2,'1433','y','Jet','270');
insert into printers(code, model, color, type, price)  values(3,'1434','y','Jet','290');
insert into printers(code, model, color, type, price)  values(4,'1401','n','Matrix','150');
insert into printers(code, model, color, type, price)  values(5,'1408','n','Matrix','270');
insert into printers(code, model, color, type, price)  values(6,'1288','n','Laser','400');