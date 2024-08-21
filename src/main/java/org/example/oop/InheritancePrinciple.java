package org.example.oop;

/**
 *
 * Mostenirea ne permite sa preluam informatii generale dintro clasa parinte si sa ne transmitem  mai departe in clasele opil
 * Scopul principal este acela de a crea un nivel de generalizare intre o serie de clase cer apertine aceluiasi context si de a le
 * permite sa se diferinteze intre ele intrun mod mult mai vizibil
 *
 *
 * Multi level inheritance =  Mostenire multipla
 * in java nu este posibil deoarece o clasa copil corespunde unui singur parinte
 *
 * Ce alternative avem
 * 1. Mostenire multiple din copil in copil, adica fiecare copil la randul luio devine parinte pentru alete clase
 * mammel -> Dog -> BabyDog...
 *
 * 2.Mostenire multipla la nivel de interfete
 * interfata = este un tip de clase care defineste de reugla
 *
 */

  // Parent clas = Base class
class Mammel {

    int age;
    String furColor;
    String species;

    Mammel(int age, String furColor, String species) {
        this.age = age;
        this.furColor = furColor;
        this.species = species;
    }

    void display() {
        System.out.println(" Parent Mammel calss " + this.species + " " + this.furColor + " " + this.age + " ");
    }

    void sound() {
        System.out.println("Mammel makes sound!");
    }

}

// Child class = Derived class

class Dog extends Mammel {

    String favoriteToy;


    Dog(int age, String furColor, String species, String favoriteToy) {
        super(age, furColor, species); // Apeleaza constructorul din clasa parinte pentru atributele generice
        this.favoriteToy = favoriteToy;


    }

    @Override
    void display() {
        super.display();
        System.out.println( "Child Dog class: " + favoriteToy);
        System.out.println(super.furColor);
    }

    @Override
    void sound() {
        System.out.println("Dog barks!");
    }
}

//class  BabyDog extends Dog {}

interface I1 {

}


public class InheritancePrinciple {
    public static void main(String[] args) {
        Mammel mammel = new Mammel(5, "rosu", "raton");
        Mammel dog1 = new Dog(4, "alb","caine", "os");
        Dog dog2 = new Dog(13, "negru","caine", "papusa");

        mammel .display();
        mammel.sound();
        System.out.println("-------------------------------");

        dog1.display();
        dog1.sound();
        System.out.println("-------------------------------");

        dog2.display();
        dog2.sound();
        System.out.println("-------------------------------");
    }
}
