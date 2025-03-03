package kg.parking.carservices.models;

public class Car {
    private Long id;
    private String model;
    private String carNumber;

    public Car(Long id, String model, String carNumber) {
        this.id = id;
        this.model = model;
        this.carNumber = carNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
