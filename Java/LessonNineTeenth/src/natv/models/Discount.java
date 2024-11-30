package natv.models;

public class Discount {
    public int fromDaysCount;
    public int percent;

    public Discount(int fromDaysCount, int percent) {
        this.fromDaysCount = fromDaysCount;
        this.percent = percent;
    }
}
