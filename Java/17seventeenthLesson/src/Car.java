public class Car {
    String brand;
    String model;
    int maxSpeed;
    int currentSpeed;

    public void drive(int speed){
        if ((currentSpeed + speed) > maxSpeed)
            System.out.println("Скорость не может быт выше максимальной");
        else
            currentSpeed += speed;
        System.out.println(currentSpeed);
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("Машина остановилась");
    }

    public void turnToLeft(){
        if (currentSpeed <= 0)
            System.out.println("Машина стоит на месте");
        else
            System.out.println("Машина поворачивается на лево");
    }

    public void turnToRight (){
        if (currentSpeed <= 0)
            System.out.println("Машина стоит на месте");
        else
            System.out.println("Машина поворачивает на право");
    }
}
