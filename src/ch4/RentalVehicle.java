package ch4;

import java.io.Serializable;

public class RentalVehicle implements Serializable {
    private Vehicle vehicle;
    private User user;
    private int rentalDays;
    public RentalVehicle() {
    }
    public RentalVehicle(Vehicle vehicle, User user, int rentalDays) {
        this.vehicle = vehicle;
        this.user = user;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}
