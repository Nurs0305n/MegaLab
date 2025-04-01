package models;

public class Discount {
    private Integer id;
    private int percent;
    private int fromDays;
    private int idChannel;

    public int getIdChannel() {
        return idChannel;
    }

    public void setIdChannel(int idChannel) {
        this.idChannel = idChannel;
    }

    public Discount(int percent, int fromDays, int idChannel) {
        this.percent = percent;
        this.fromDays = fromDays;
        this.idChannel = idChannel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getFromDays() {
        return fromDays;
    }

    public void setFromDays(int fromDays) {
        this.fromDays = fromDays;
    }
}
