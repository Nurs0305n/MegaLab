package models;

import java.util.Date;

public record Entry(Integer id, Date startDate, Date endDate, double totalPrice, Car car, Tariff tariff) {
    public Entry(Car car){
        this(null, new Date(), null, 0, car, null);
    }
}
