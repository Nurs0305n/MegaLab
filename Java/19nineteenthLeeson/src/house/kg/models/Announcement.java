package house.kg.models;

import house.kg.models.client.Client;
import house.kg.models.deal.DealType;
import house.kg.models.realEstate.RealEstateType;

public class Announcement {
    Client client;
    DealType dealType;
    RealEstateType realEstateType;

    public Announcement(Client client, DealType dealType, RealEstateType realEstateType) {
        this.client = client;
        this.dealType = dealType;
        this.realEstateType = realEstateType;
    }
}
