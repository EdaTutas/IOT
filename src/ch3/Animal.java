package ch3;

public abstract class Animal {
    /*
    Inheritance(Kalıtım)
    - Bu sınıftan doğrudan nesne oluşturulmasını önlemek istiyoruz.
    - Somutlaştırma işlemini alt sınıflarda yapacağız.
    - abstract(soyut)
    - Soyut methodu olabilir. Ama olmak zorunlu değildir.
    - Bir sınıftan sadece bir tane soyut sınıf extends edebiliriz. Java çoklu class kalıtımını desteklemez.
    - Arayüz (Interface)  - Bir sınıf birden fazla interface i implement edebilir. Yani uygulayabilir.
    - Arayüz amacı yalnızca methodun imzasını tanımlamaktır.

     */

    public Animal(String name) {
        this.name = name;
    }

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Soyut mehtod
    public abstract void makeSound();
}
