package kg.mega.train_voyages.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trains")
public class Train {
    @Id
    @GeneratedValue
    private Long id;
    private int trainNumber;
    @OneToMany(mappedBy = "train")
    private List<Carriage> carriages;

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    @ManyToOne
    @JoinColumn(name = "train_type_id")
    private TrainType trainType;

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}
