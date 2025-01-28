import models.*;
import services.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
        ChannelService channelService = new ChannelService();

        List<Channel> channels = channelService.getChannels();

        for (Channel channel: channels){
            System.out.printf("id: %d, name: %s, price per symbol: %.2f,%n", channel.getId(), channel.getName(), channel.getPricePerSymbol());
        }

        String text = "Продается ноутбук.";

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        List<Date> ntvDates = new ArrayList<>();
        ntvDates.add(sdf.parse("01.02.2025"));
        ntvDates.add(sdf.parse("02.02.2025"));
        ntvDates.add(sdf.parse("03.02.2025"));
        ntvDates.add(sdf.parse("04.02.2025"));

        ChannelRequests ntvChannelRequest = new ChannelRequests(1, ntvDates);

        List<Date> eltrDates = new ArrayList<>();
        eltrDates.add(sdf.parse("29.01.2025"));
        eltrDates.add(sdf.parse("30.01.2025"));
        eltrDates.add(sdf.parse("31.01.2025"));
        eltrDates.add(sdf.parse("01.02.2025"));
        eltrDates.add(sdf.parse("02.02.2025"));

        ChannelRequests eltrChannelRequest = new ChannelRequests(3, eltrDates);

        List<ChannelRequests> requestsChannels = new ArrayList<>();
        requestsChannels.add(ntvChannelRequest);
        requestsChannels.add(eltrChannelRequest);

        Request request = new Request();
        request.setClientName("Nurs");
        request.setEmail("nurs@gmail.com");
        request.setPhoneNumber("0500230503");
        request.setText(text);
        request.setChannelRequests(requestsChannels);

        RequestService requestService = new RequestService();

        requestService.createRequest(request);
    }
}