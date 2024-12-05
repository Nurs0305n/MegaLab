package Parking.models;

public class RatePlan {
    private int minutes;
    private double price;

    public RatePlan(int minutes, double price) {
        this.minutes = minutes;
        this.price = price;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
