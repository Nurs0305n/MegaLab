package natv.models;

public class Order {
    public String text;
    public int simbolsCount;
    Channel[] channels;

    public Order(String text, int simbolsCount, Channel[] channels, Client cient) {
        this.text = text;
        this.simbolsCount = simbolsCount;
        this.channels = channels;
        this.cient = cient;
    }

    Client cient;

}
