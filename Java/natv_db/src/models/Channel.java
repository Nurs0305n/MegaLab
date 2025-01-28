package models;

public class Channel {
    private Integer id;
    private String name;
    private double pricePerSymbol;

    public Channel(String name, double pricePerSymbol) {
        this.name = name;
        this.pricePerSymbol = pricePerSymbol;
    }

    public Channel(Integer id, String name, double pricePerSymbol) {
        this.id = id;
        this.name = name;
        this.pricePerSymbol = pricePerSymbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerSymbol() {
        return pricePerSymbol;
    }

    public void setPricePerSymbol(double pricePerSymbol) {
        this.pricePerSymbol = pricePerSymbol;
    }
}
