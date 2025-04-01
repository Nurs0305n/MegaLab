package nurs.trainvoyage.models;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate sendDate;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime sendTime;
    @ManyToOne
    @JoinColumn(name = "destination_locality_id")
    private Locality destinationLocality;
    @ManyToOne
    @JoinColumn(name = "strating_locality_id")
    private Locality startingLocality;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime arrivalTime;
    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;
    private double distance;
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public LocalTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalTime sendTime) {
        this.sendTime = sendTime;
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

    public void setStartingLocality(Locality stratingLocality) {
        this.startingLocality = stratingLocality;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
