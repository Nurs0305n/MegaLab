package natv;

import natv.models.Channel;
import natv.models.Client;
import natv.models.Discount;
import natv.models.Order;

public class Main {
    public static void main(String[] args) {

        Discount[] discounts = new Discount[3];
        discounts[0] = new Discount(3, 5);
        discounts[1] = new Discount(5, 10);
        discounts[2] = new Discount(10, 15);
        Channel nts = new Channel("HTC", discounts);
        Channel borsokTv = new Channel("Borsok TV", null);

        Client client = new Client("Mega","fm@mail.ru", "+996773243254");

        String text = "fdslkf kjklajsl kjdslfkaj";
        Channel[] channels = new Channel[2];
        channels[0] = nts;
        channels[1] = borsokTv;

        channels[0].date = new String[2];
        channels[0].date[0] = "01.12.2024";
        channels[0].date[1] = "02.12.2024";

        channels[1].date = new String[1];
        channels[1].date[0] = "01.12.2024";

        Order order = new Order(
                text,
                text.replace(" ", "").length(),
                channels,
                client);
    }
}