package ch3;

public abstract class Mammal extends Animal{
    //classları extends ederim
    //interface leri implements ederim

    /* 1
    String mammalName;
    public Mammal(String mammalName){
        this.mammalName=mammalName;
    }
     */

    /* 2
    String birth;

    public Mammal(String name, String birth){
        super(name);
        this.birth = birth;
    }
     */

    public Mammal(String name) {
        super(name);
    }
}

