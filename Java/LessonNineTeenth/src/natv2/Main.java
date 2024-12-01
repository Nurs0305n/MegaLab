package natv2;

import natv2.models.*;

public class Main {
    public static void main(String[] args) {

        Discount[] discounts = new Discount[3];
        discounts[0] = new Discount(3, 5);
        discounts[1] = new Discount(5, 10);
        discounts[2] = new Discount(10, 15);

        Channel nts = new Channel("HTC", discounts);
        Channel tnt = new Channel("THT", null);

        Client client = new Client("Fedya", "+996555234253", "fm@fd.com");

        Channel[] channels = new Channel[2];
        channels[0] = nts;
        channels[1] = tnt;

        channels[0].date = new String[2];
        channels[0].date[0] = "01.12.2024";
        channels[0].date[1] = "02.12.2024";

        channels[1].date = new String[1];
        channels[1].date[0] = "01.12.2024";

        String text = "fdsf adfad dsfsd fsadfa  sdfa adfa fasfds";

        Order order = new Order(text, text.replace(" ", "").length(), client, channels);
    }
}
