package ch4;

import java.io.File;
import java.io.Serializable;

//Tablo İsmi
public class User {

    /* Column (Kolon) ismi

        USER
    name     email
    eda     edatutas@gmail.com
    esra    esra@gmail.com
     */
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /*
    POJO (Plain Old Java Object)
    Basit ve sıradan bir sınıf ifade ediyor.

    - private , Getter setter
    - Anlaşılabilir ve kolay olmasını sağlamak
    - sadece verileri tutan ve işlemesini sağlayan basit sınıflar olarak kullanılır. (Model nesneleri)
    - Java Bean Standartlarını kullanılır.

    Java Bean
    - Parametresiz contructor methodu olmalıdır.
    - Serileştirme desteği
        Java Bean sınıfları serileştirilebilir olmalıdır.
        Serializable arayüzünü implement etmelidir. Yani uygulamalıdır.
     */
}
