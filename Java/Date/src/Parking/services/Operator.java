package Parking.services;

import Parking.models.Car;
import Parking.models.CheckIn;
import Parking.models.RatePlan;

public class Operator {
    private RatePlan[] ratePlans;
    private CheckIn[] checkIns;

    public Operator(RatePlan[] ratePlans, int placesCount) {
        this.ratePlans = ratePlans;
        this.checkIns = new CheckIn[placesCount];
    }

    public void checkIn(){

    }
}
