package natv2.models;

public class Channel {
    public String name;
    public Discount[] discounts;
    public String[] date;

    public Channel (String name, Discount[] discounts){
        this.name = name;
        this.discounts = discounts;
    }
}
