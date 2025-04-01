package kg.megalab.channelsadd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cahnnels")
public class Channel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double pricePerSymbol;

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

    public Double getPricePerSymbol() {
        return pricePerSymbol;
    }

    public void setPricePerSymbol(Double pricePerSymbol) {
        this.pricePerSymbol = pricePerSymbol;
    }
}
