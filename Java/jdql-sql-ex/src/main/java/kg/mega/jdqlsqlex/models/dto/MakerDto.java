package kg.mega.jdqlsqlex.models.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class MakerDto {
    String maker;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public MakerDto(String maker) {
        this.maker = maker;
    }
}
