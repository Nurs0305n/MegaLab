package cab.kg.models;

public class Price {
    public double from;
    public double to;
    public Currency currency;

    public Price(double from, double to, Currency currency) {
        this.from = from;
        this.to = to;
        this.currency = currency;
    }
}
