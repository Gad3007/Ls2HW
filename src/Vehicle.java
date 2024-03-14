public abstract class Vehicle {
    int id;
    String brand; // марка
    String model;
    int year; //год выпуска

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Метод запуска двигателя
    void startEngine() {
        System.out.println("Двигатель запущен врум врум");


    }

    // Метод остановки двигателя
    void stopEngine(){
        System.out.println("Двигатель выключен ");

    }

    //Увеличение скорости
    void accelerate(int speed){
        System.out.println("Cкорость увеличивается на: " + speed);

    }

    //Прекращение движения
    void brake(){
        System.out.println("Прекращение движения");

    }

    // Вывод информации о транспортном средстве
    abstract void displayInfo();


}
