package kg.mega.sqlexjpatest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "printers")
public class Printer {

    @Id
    @Column(name = "code")
    private Integer id;
    private String color;
    @Column(length = 10)
    private String type;
    private double price;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
}
