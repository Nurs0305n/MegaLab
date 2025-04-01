package kg.mega.jdqlsqlex.models;

import jakarta.persistence.*;

@Entity
@Table(name = "printers")
public class Printer {
    @Id
    @Column(name = "code")
    private Integer id;

    private char color;

    @Column(length = 10)
    private String type;

    private double price;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
}
