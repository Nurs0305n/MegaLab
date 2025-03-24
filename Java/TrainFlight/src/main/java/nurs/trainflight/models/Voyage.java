package nurs.trainflight.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "voyages")
public class Voyage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate sendDate;
    private LocalTime sendTime;
    @ManyToOne
    @JoinColumn(name = "destination_locality_id")
    private Locality destinationLocality;
    @ManyToOne
    @JoinColumn(name = "strating_locality_id")
    private Locality stratingLocality;
    private LocalDateTime arrivalTime;
    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;
    private double distance;
    private double price;
}
