package house.kg.models.realEstate;

public class RealEstateType {
    String type;
    Series series;
    Hearting hearting;
    MaterialOfTheHouse materialOfTheHouse;
    Floor floor;
    int area;
    double ceilingHeight;
    District district;
    Document document;
    double price;

    public RealEstateType(String type, Series series, Hearting hearting, MaterialOfTheHouse materialOfTheHouse, Floor floor, int area, double ceilingHeight, District district, Document document, double price) {
        this.type = type;
        this.series = series;
        this.hearting = hearting;
        this.materialOfTheHouse = materialOfTheHouse;
        this.floor = floor;
        this.area = area;
        this.ceilingHeight = ceilingHeight;
        this.district = district;
        this.document = document;
        this.price = price;
    }
}
