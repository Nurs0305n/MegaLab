package models;

public record Tariff(Integer id, int toMinute, int price) {
    public Tariff(int toMinute, int price){
        this(null, toMinute, price);
    }
}
