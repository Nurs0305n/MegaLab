package models;

public record Car(Integer id, String carNumber) {
    public Car(String carNumber){
        this(null, carNumber);
    }
}
