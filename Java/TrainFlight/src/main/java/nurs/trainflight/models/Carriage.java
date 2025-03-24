package nurs.trainflight.models;

import jakarta.persistence.*;

@Entity
@Table(name = "carriages")
public class Carriage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int CarriageNumber;

    @ManyToOne
    @JoinColumn(name = "carriage_type_id")
    private CarriageType CarriageType;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;
}
