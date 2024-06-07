package ch4;
public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void drive(){
        System.out.println("Driving a car");
    }
}
