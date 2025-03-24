package kg.mega.jdqlsqlex.models.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

public class ModelRamScreen {
    String model;
    int ram;
    int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ModelRamScreen(String model, int ram, int speed) {
        this.model = model;
        this.ram = ram;
        this.speed = speed;
    }
}
