import models.*;
import services.three.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Channel channel = new Channel("7", 1);

        ChannelService channelService = new ChannelService();
        try {
            channelService.addNewChannel(channel);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Discount discount = new Discount(5, 3, channel.getId());
        Discount discount1 = new Discount(10, 10, channel.getId());
        Discount discount2 = new Discount(15, 15, channel.getId());

        List<Discount> discounts = new ArrayList<>();
        discounts.add(discount);
        discounts.add(discount1);
        discounts.add(discount2);


        DiscountService discountService = new DiscountService();
        try {
            discountService.addDiscountsForChannel(discounts);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Выберите действие" +
//                    "1. Создать канал. ");
//            int mode = scanner.nextInt();
//
//            switch (mode){
//
//            }
    }
}