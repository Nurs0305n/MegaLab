package nurs.trainvoyage.models;

import jakarta.persistence.*;

@Entity
@Table(name = "trains")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int trainNumber;

    @ManyToOne
    @JoinColumn(name = "train_type_id")
    private TrainType trainType;
}
