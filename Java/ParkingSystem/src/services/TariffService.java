package services;

import models.Tariff;

public interface TariffService {
    Double getPriceByMinute(int minute);
}
