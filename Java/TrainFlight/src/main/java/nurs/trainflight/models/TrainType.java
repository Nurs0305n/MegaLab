package nurs.trainflight.models;

import jakarta.persistence.*;

@Entity
@Table(name = "train_types")
public class TrainType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
