package ecxeptions;

public class TariffsListEmpty extends RuntimeException {
    public TariffsListEmpty(){
        System.out.println("Список тарифов пуст!");
    }

}
