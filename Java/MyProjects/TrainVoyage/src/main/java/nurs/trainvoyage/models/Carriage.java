package nurs.trainvoyage.models;

import jakarta.persistence.*;

@Entity
@Table(name = "carriages")
public class Carriage {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCarriageNumber() {
        return CarriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        CarriageNumber = carriageNumber;
    }

    public CarriageType getCarriageType() {
        return CarriageType;
    }

    public void setCarriageType(CarriageType carriageType) {
        CarriageType = carriageType;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

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
