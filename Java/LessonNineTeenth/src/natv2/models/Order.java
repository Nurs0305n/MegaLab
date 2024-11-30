package natv2.models;

public class Order {
    public String text;
    public int symbolsCount;
    Client client;
    Channel[] channels;

    public Order (String text, int symbolsCount, Client client, Channel[] channels){
        this.text = text;
        this.symbolsCount = symbolsCount;
        this.client = client;
        this.channels = channels;
    }
}
