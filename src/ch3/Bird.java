package ch3;

public class Bird extends Animal implements Flyable,Walkable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "chirps");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is flying");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "is walking on 2 legs");
    }
}
