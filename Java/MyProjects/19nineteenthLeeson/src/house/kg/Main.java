package house.kg;

import house.kg.models.Announcement;
import house.kg.models.client.Client;
import house.kg.models.deal.DealType;
import house.kg.models.realEstate.*;


public class Main {
    public static void main(String[] args) {
        Client client = new Client("Этажи", "+996 995 88-10-41", "etaji@mail.ru");

        DealType dealType = new DealType("Купить");

        Region region = new Region("Чуй");
        City city = new City("Бишкек", region);
        District district = new District("Восток-5 микрорайон", city);

        Document document = new Document("Красная книга");
        Floor floor = new Floor (7,9);
        Hearting hearting = new Hearting("Центральна");
        Series series = new Series("106 серия");
        MaterialOfTheHouse materialOfTheHouse = new MaterialOfTheHouse("Кирпич 2017 года");

        RealEstateType realEstateType = new RealEstateType("Квартира", series, hearting, materialOfTheHouse, floor, 85, 2.7, district, document, 115_000);

        Announcement announcement = new Announcement(client, dealType, realEstateType);

    }
}
