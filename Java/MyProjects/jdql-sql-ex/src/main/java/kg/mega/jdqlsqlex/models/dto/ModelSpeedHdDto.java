package kg.mega.jdqlsqlex.models.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ModelSpeedHdDto {
    String model;
    int speed;
    double hd;

    public ModelSpeedHdDto(String model, int speed, double hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }
}
