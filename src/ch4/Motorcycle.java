package ch4;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar){
        super(brand,model,year);
        this.hasSideCar=hasSideCar;

    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void drive(){
        System.out.println("Riding a motorcycle");
    }
}
