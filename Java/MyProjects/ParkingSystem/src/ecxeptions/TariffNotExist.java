package ecxeptions;

public class TariffNotExist extends RuntimeException {
    public TariffNotExist() {
        System.out.println("Такого тарифа нет!");
    }
}
