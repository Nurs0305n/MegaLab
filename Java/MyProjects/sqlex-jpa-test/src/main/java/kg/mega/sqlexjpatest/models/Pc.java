package kg.mega.sqlexjpatest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "pcs")
public class Pc {

    @Id
    @Column(name = "code")
    private Integer id;
    private int speed;
    private int ram;
    private double hd;
    @Column(length = 10)
    private String cd;
    private double price;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
