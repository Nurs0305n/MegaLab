package kg.mega.trainflight.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "carriages")
public class Carriage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long carriageNumber;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "carriage_type_id")
    private CarriageType carriageType;
    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(long carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public CarriageType getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(CarriageType carriageType) {
        this.carriageType = carriageType;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
