package services;

import models.Entry;
import models.Tariff;

import java.util.Date;

public class EntryService {
    public double getTotalPrice(Entry entry) {
        return (int) ((double) (entry.startDate().getTime() - entry.endDate().getTime()) / 1000 / 60) * entry.tariff().price();
    }
        public double getTotalPrice(Date startDate, Date endDate, Tariff tariff) {
        return (int)((double) (startDate.getTime() - endDate.getTime()) / 1000 / 60) * tariff.price();
    }

    public int getMinute(Date startDate, Date endDate) {
        int minute = 0;

        minute = (int)((double)(endDate.getTime() - startDate.getTime()) / 1000 / 60);

        return minute;
    }
}
