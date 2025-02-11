package services;

import models.Entry;
import models.Tariff;

public class EntryService {
    public double getTotalPrice(Entry entry){
        return (int)((double) (entry.startDate().getTime() - entry.endDate().getTime()) / 1000 / 60) * entry.tariff().price();
    }
}
