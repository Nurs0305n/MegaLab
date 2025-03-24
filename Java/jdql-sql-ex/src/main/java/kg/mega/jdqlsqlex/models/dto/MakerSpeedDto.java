package kg.mega.jdqlsqlex.models.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

public class MakerSpeedDto {
    double maker;
    int speed;

    public double getMaker() {
        return maker;
    }

    public void setMaker(double maker) {
        this.maker = maker;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public MakerSpeedDto(double maker, int speed) {
        this.maker = maker;
        this.speed = speed;
    }
}
