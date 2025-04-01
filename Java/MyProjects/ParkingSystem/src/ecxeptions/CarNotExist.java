package ecxeptions;

public class CarNotExist extends RuntimeException {
    public CarNotExist(){
        System.out.println("Такой машины нет!");
    }
}
