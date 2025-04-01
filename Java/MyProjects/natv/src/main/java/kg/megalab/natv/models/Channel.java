package kg.megalab.natv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "channels")
public class Channel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double pricePerSymbol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
