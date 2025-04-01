package models;

import java.util.List;

public class Flat {
    private Integer id;
    private Integer roomsCount;
    private Integer area;
    private Integer pricePerRent;
    private Region region;
    private List<Resident> residents;

    public Flat(Integer roomsCount, Integer area, Integer pricePerRent) {
        this.roomsCount = roomsCount;
        this.area = area;
        this.pricePerRent = pricePerRent;
    }

    public Flat(Integer id, Integer roomsCount, Integer area, Integer pricePerRent) {
        this.id = id;
        this.roomsCount = roomsCount;
        this.area = area;
        this.pricePerRent = pricePerRent;
    }

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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPricePerRent() {
        return pricePerRent;
    }

    public void setPricePerRent(Integer pricePerRent) {
        this.pricePerRent = pricePerRent;
    }

    public List<Resident> getResidents() {
        return residents;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }
}
