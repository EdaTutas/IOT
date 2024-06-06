package ch3;

public class Bat extends Mammal implements Flyable {

    public Bat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + "screeches");
    }

    @Override
    public void fly(){
        System.out.println(getName() + " is flying at night");
    }

}
