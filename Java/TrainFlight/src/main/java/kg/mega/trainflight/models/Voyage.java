package kg.mega.trainflight.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "voyages")
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate sendDate;
    private LocalTime sendTime;
    @ManyToOne
    @JoinColumn (name = "destination_locality_id")
    private Locality destinationLocality;
    @ManyToOne
    @JoinColumn(name = "starting_locality_id")
    private Locality startingLocality;
    private LocalDateTime arrivalTime;
    private double price;
    @ManyToOne
    @JoinColumn(name = "tarain_id")
    private Train train;
    private double distance;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getLocalDate() {
        return sendDate;
    }

    public void setLocalDate(LocalDate sendDate) {
        this.sendDate = Voyage.this.sendDate;
    }

    public LocalTime getLocalTime() {
        return sendTime;
    }

    public void setLocalTime(LocalTime sendTime) {
        this.sendTime = Voyage.this.sendTime;
    }

    public Locality getDestinationLocality() {
        return destinationLocality;
    }

    public void setDestinationLocality(Locality destinationLocality) {
        this.destinationLocality = destinationLocality;
    }

    public Locality getStartingLocality() {
        return startingLocality;
    }

    public void setStartingLocality(Locality startingLocality) {
        this.startingLocality = startingLocality;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
