package kg.mega.sqlexjpatest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(length = 50)
    private String model;

    @Column(length = 10)
    private String maker;

    @Column(length = 50)
    private String type;

}
