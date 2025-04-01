package ecxeptions;

public class CarsListEmpty extends RuntimeException {
    public CarsListEmpty(){
        System.out.println("Список машин пуст!");
    }
}
