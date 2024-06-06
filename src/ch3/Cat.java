package ch3;

public class Cat extends Mammal implements Walkable{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + "meows!");
    }

    @Override
    public void walk(){
        System.out.println(getName() + " is walking on 4 legs.");
    }

}
