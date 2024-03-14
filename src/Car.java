public class Car extends Vehicle{
    int fuelCapacity = 60;
    int currentFuelLevel = 20;

    public Car(int id, String brand, String model, int year) {
        super(id, brand, model, year);
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
    void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    void brake() {
        super.brake();
    }
    @Override
    void displayInfo() {
        System.out.printf("ID: %d \nМарка автомобиля: %s \nМодель: %s \nГод выпуска: %d \n\nЁмкость топливного бака: %d \nТекущий уровень топлива: %d\n",
                id, brand, model, year, fuelCapacity, currentFuelLevel);
    }

    void refuel(int liters){
            int refuel = currentFuelLevel + liters;
            if (refuel > fuelCapacity){
                System.out.println("Бак переполнен");
            }
            else if (refuel == fuelCapacity){
                System.out.println("Бак полон");
            }
            else if (liters < 0){
                System.out.println("Некоректное кол-во топлива");
            }
            else{
                currentFuelLevel += liters;
                System.out.println("Текущий уровень топлива: " + currentFuelLevel);
            }

        }



    }




