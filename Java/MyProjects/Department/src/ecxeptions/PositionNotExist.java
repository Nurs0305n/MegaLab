package ecxeptions;

public class PositionNotExist extends RuntimeException {
    public PositionNotExist(){
        System.out.println("Такой дложности нет!");
    }
}
