public class Boat extends Vehicle implements Swimmable{
    public Boat(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    @Override
    public void startSwimming(){
        System.out.println("Начало плавания");

    }
    @Override
    public void stopSwimming(){
        System.out.println("Завершение плавания");

    }
    @Override
    void startEngine() {
        super.startEngine();
    }

    @Override
    void stopEngine() {
        super.stopEngine();
    }
    @Override
    void displayInfo() {
        System.out.printf("ID: %d \nМарка лодки: %s \nМодель: %s \nГод выпуска: %d \n",
                id, brand, model, year);
    }
}
