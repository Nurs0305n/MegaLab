package ecxeptions;

public class TariffNotExist extends RuntimeException {
    public TariffNotExist() {
        System.out.println("Tariff Not Exist");
    }
}
