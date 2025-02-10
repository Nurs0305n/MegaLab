package models;

import java.util.List;

public class Flat {
    private Integer id;
    private Integer roomsCount;
    private Double area;
    private Integer pricePerRent;
    private Region region;
    private List<Resident> residents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getPricePerRent() {
        return pricePerRent;
    }

    public void setPricePerRent(Integer pricePerRent) {
        this.pricePerRent = pricePerRent;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Resident> getResidents() {
        return residents;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }
}
