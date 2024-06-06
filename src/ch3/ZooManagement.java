package ch3;

public class ZooManagement {
    public static void main(String[] args) {
        /*
        Animal cat2 = new Animal("Cat2");
        Abstract olan bir class ı new leyemem.
        Çünkü benim amacım o classtan nesne oluşturulmamasını sağlamak.
         */


        /*

        Animal cat = new Cat("Cat");
        Animal bird = new Bird("Bird");
        Animal bat = new Bat("Bat");


        cat.makeSound();

        //UpCasting DownCasting
        // instanceof -- cat nesneninin Walkable arayüzünü uygulayıp uygulamadığını kontrol eder.
        if(cat instanceof Walkable){
            ((Walkable) cat).walk();

        }

        bird.makeSound();
        if(bird instanceof Walkable){
            ((Walkable) bird).walk();

        }

        if(bird instanceof Flyable){
            ((Flyable) bird).fly();
        }


        bat.makeSound();
        if(bat instanceof Flyable){
            ((Flyable) bat).fly();
        }

         */


        Cat cat2 = new Cat("cat2");
        cat2.makeSound();
        cat2.walk();

        Bird bird2 = new Bird("bird2");
        bird2.fly();
        bird2.walk();
        bird2.makeSound();

        Bat bat2 = new Bat("Bat");
        bat2.fly();
        bat2.makeSound();

    }
}
