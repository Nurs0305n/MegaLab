package house.kg.models.deal;

public class DealType {
    String type;
    public boolean exchange;
    public boolean installment;
    public boolean mortgage;
    public boolean fromTheOwner;
    public boolean thereIsPhoto;
    public boolean urgently;

    public DealType(String type) {
        this.type = type;
    }
}
