package models;

import java.util.List;

public class Flat {
    private Integer id;
    private Integer rooms_count;
    private Integer area;
    private Integer price_per_rent;
    private List<Resident> residents;

    public Flat(Integer rooms_count, Integer area, Integer price_per_rent, List<Resident> residents) {
        this.rooms_count = rooms_count;
        this.area = area;
        this.price_per_rent = price_per_rent;
        this.residents = residents;
    }

    public Flat(Integer id, Integer rooms_count, Integer area, Integer price_per_rent, List<Resident> residents) {
        this.id = id;
        this.rooms_count = rooms_count;
        this.area = area;
        this.price_per_rent = price_per_rent;
        this.residents = residents;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRooms_count() {
        return rooms_count;
    }

    public void setRooms_count(Integer rooms_count) {
        this.rooms_count = rooms_count;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrice_per_rent() {
        return price_per_rent;
    }

    public void setPrice_per_rent(Integer price_per_rent) {
        this.price_per_rent = price_per_rent;
    }

    public List<Resident> getResidents() {
        return residents;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }
}
