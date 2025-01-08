package natv.models;

public class Channel {
    public String name;
    public Discount[] discount;
    public String[] date;

    public Channel(String name, Discount[] discount) {
        this.name = name;
        this.discount = discount;
    }
}
