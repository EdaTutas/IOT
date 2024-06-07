package ch4;

public class Rent {
    public void rentVehicle(RentalVehicle rentalVehicle){
        try{
            System.out.println("Renting vehicle to user: " + rentalVehicle.getUser().getName());
            rentalVehicle.getVehicle().startEngine();
            rentalVehicle.getVehicle().drive();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
              /*
            Car car2 = new Car("Wv", "golf", 2020, 4);
            car2.drive();
            car2.getYear();
            */

            User user = new User("Eda TUTAŞ AKKOCA" , "edatutas@gmail.com");
            Vehicle car = new Car("Hyundai", "i20",2020,4);

            RentalVehicle rentalVehicle= new RentalVehicle(car,user,7);
            Rent rent = new Rent();
            rent.rentVehicle(rentalVehicle);


            Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, true);
            RentalVehicle rentalMotorcycle = new RentalVehicle(motorcycle, user, 3);
            rent.rentVehicle(rentalMotorcycle);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
