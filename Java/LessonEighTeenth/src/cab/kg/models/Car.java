package cab.kg.models;

public class Car {

    public String model;
    public CarType carType;
    public DriveType driveType;
    public int seatsCount;
    public int luggageCount;
    public int doorCount;
    public Transmission transmission;
    public int issueYear;
    public Fuel fuel;
    public int consumptionPerKm;
    public boolean isLeftHand;
    public Price[] prices;

    public Car(String model, CarType carType, DriveType driveType,  int seatsCount, int luggageCount, int doorCount, Transmission transmission, int issueYear, Fuel fuel, int consumptionPerKm, boolean isLeftHand, Price[] prices) {
        this.model = model;
        this.carType = carType;
        this.driveType = driveType;
        this.seatsCount = seatsCount;
        this.luggageCount = luggageCount;
        this.doorCount = doorCount;
        this.transmission = transmission;
        this.issueYear = issueYear;
        this.fuel = fuel;
        this.consumptionPerKm = consumptionPerKm;
        this.isLeftHand = isLeftHand;
        this.prices = prices;
    }
}
