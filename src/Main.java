//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car(1,"BMW", "x3", 2008);
        car.startEngine();
        car.accelerate(2);
        car.displayInfo();
        car.refuel(40);
        System.out.println();
        Aircraft boing666 = new Aircraft(2,"Боинг", "666",2042);
        boing666.startEngine();
        boing666.takeOff();
        boing666.displayInfo();
        boing666.stopEngine();
        boing666.land();
        boing666.displayInfo();
        System.out.println();
        Boat boat = new Boat(3,"ПрофМарин", "777", 1996);
        boat.displayInfo();
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();


    }
}