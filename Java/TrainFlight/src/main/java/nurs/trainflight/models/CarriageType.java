package nurs.trainflight.models;

import jakarta.persistence.*;

@Entity
@Table(name = "carriage_types")
public class CarriageType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double extraPrice;

}
