package laptops;

public class Main {

    public static void main(String[] args) {

        Laptop[] laptops = new Laptop[6];

        Laptop l1 = new Laptop();
        l1.code = 1;
        l1.model = "1298";
        l1.speed = 350;
        l1.ram = 32;
        l1.hd = 4;
        l1.price = 700;
        l1.screen = 11;

        Laptop l2 = new Laptop();
        l2.code = 2;
        l2.model = "1321";
        l2.speed = 500;
        l2.ram = 64;
        l2.hd = 8;
        l2.price = 970;
        l2.screen = 12;

        Laptop l3 = new Laptop();
        l3.code = 3;
        l3.model = "1750";
        l3.speed = 750;
        l3.ram = 128;
        l3.hd = 12;
        l3.price = 1200;
        l3.screen = 14;

        Laptop l4 = new Laptop();
        l4.code = 4;
        l4.model = "1298";
        l4.speed = 600;
        l4.ram = 64;
        l4.hd = 10;
        l4.price = 1150;
        l4.screen = 15;

        Laptop l5 = new Laptop();
        l5.code = 5;
        l5.model = "1752";
        l5.speed = 750;
        l5.ram = 128;
        l5.hd = 10;
        l5.price = 1150;
        l5.screen = 14;

        Laptop l6 = new Laptop();
        l6.code = 6;
        l6.model = "1298";
        l6.speed = 450;
        l6.ram = 64;
        l6.hd = 10;
        l6.price = 950;
        l6.screen = 12;

        laptops[0] = l1;
        laptops[1] = l2;
        laptops[2] = l3;
        laptops[3] = l4;
        laptops[4] = l5;
        laptops[5] = l6;

        System.out.println("1 ***************");

        for (Laptop lap: laptops) {
            if (lap.price > 1000) {
                System.out.println("Модель: " + lap.model);
                System.out.println("HD: " + lap.hd);
                System.out.println("Screen: " + lap.screen);
                System.out.println();
            }
        }

        //Вывести код и модель, у кроторых объем жесткого диска не менее 10 и размер лэкрана меньше 13
        System.out.println("\n2 ***************");
        for (Laptop lap: laptops){
            if (lap.hd >= 10 && lap.screen < 13){
                System.out.println("Код: " + lap.code);
                System.out.println("Модель: " + lap.model);
            }
        }

        //Вывести модель самого дорого ноутбука с объемом жесткого диска не более 10
        System.out.println("\n3 **************");
        Laptop lNeed = new Laptop();
        for (Laptop lap: laptops){
            if (lap.price > lNeed.price && lap.hd <= 10)
                lNeed = lap;
        }
        System.out.println("Модель: " + lNeed.model);

        //Вывести среднюю стоимость ноутбука, у которых скорость больше 500
        System.out.println("\n4 ***************");
        double middlePrice = 0;
        double count = 0;
        for (Laptop lap: laptops){
            if (lap.speed > 500) {
                middlePrice += lap.price;
                count++;
            }
        }
        System.out.println("Средняя цена: " + middlePrice / count);

        //Вывести модели у которых стоимость между 1000 и 1100 с размером экрана не менее 13
        System.out.println("\n5 **************");
        for (Laptop lap: laptops){
            if (lap.price >= 1000 && lap.price <= 1150 && lap.screen >= 13)
                System.out.println("Модель: " + lap.model);
        }

        //Вывести коды ноутбуков, у которых скорость не менее 500 и стоимость не превышает 1000
        System.out.println("\n6 *************");
        for (Laptop lap: laptops){
            if (lap.speed >= 500 && lap.price <= 1000)
                System.out.println("Код: " + lap.code);
        }

    }
}
