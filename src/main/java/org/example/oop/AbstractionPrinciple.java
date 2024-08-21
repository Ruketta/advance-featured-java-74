package org.example.oop;

/**
 *                 ------------------------------ Keywords ------------------------------
 * Prescurtari din cod :
 *
 *
 * NU puteti avea mai multe metoda de "Main" intro clasa, pentru scopul ester de a compila codul dpdv sintatic.
 * Insa, chiar daca metoda main e unica la nivel de clasa, mai multe clase, pot avea fiecare o metoda main.
 *
 * Sinonime
 *    Librarie = proiect java
 *    Metoda = Functie
 *
 * Keywords sunt instruction predefinite in JAVA prin care interactiona cu functionalitateile compilatorului.
 * Class = este o schita generala a unei tipologii de obiect
 * Obiectul = este instanta unei calse
 * Metoda = este functionalitatea clasei
 * Semnatura Metodei = reprezinta modul de definitie al unei functii/metode
 * Corpul Metodei = reprezinta instructiunile definite intre acoladele metodei
 *
 * Clasa se poate utiliza mai multe scopuri:
 * - tip de date : acesta reprezinta natura obiectului/variabilei/constantei pe care o definim.
 *
 *
 *                  ------------------------------ Abstraction ------------------------------
 *
 *
 * Abstractizare este unul din principalele ale programarii  orientate pe obiecte si se refera la conceputul de ascundere
 * a detaliilor de impelementare ale clasei prin expunerea partilor esentiale la nivel de obiect.
 *
 * Putem reprezenta abstractizarea in urmatoarele moduri:
 *  1. clase Wrapper = reprezinta o clasa ce se comprta ca un invelist peste un anumit context functional
 *     - tipuri de date primitive: int, double, float, byte, short, char....
 *     - tipurile de date wrapper: Integer, Double, Float, Byte, Short, Character....
 *  2. clase abstracte
 *  3. Interfete
 *
 */

// Aplicatie: Dat fiind 3 clase identificand figuri geometrice, imi doresc sa creez o clasa abstracte si o intrfata comuna
// care se defineasa un nivel comun de configuratie pentru toate figurile disctate (cerc, patrat, dreptunghi...)

abstract class Shape {
    protected double perimeter;
    protected double area;


    public abstract  double calculateArea();

    public abstract double calculatePerimeter();

    public  void  dispaly() {
        System.out.println("Perimeter" + perimeter + " Area " + area);
    }
}

interface SahpeInterface {

    void draw();

}

class Circle extends Shape implements SahpeInterface {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}

class Squer extends Shape implements SahpeInterface {

    private double valeu;
    Squer(double valeu) {
        this.valeu = valeu;
        this.area = calculateArea();
        this.perimater
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public void draw() {

    }
}

class Rectangular extends Shape implements SahpeInterface{

    private  double length;
    private double width;

    Rectangular(double length, double width){
        this.length
    }


    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public void draw() {

    }

}

public class AbstractionPrinciple {
    public static void main(String[] args) {
        // Ex 1 : Abstractizare prin clase Wrapper
        Integer nr1 = 98;
        Integer nr2 = 78;

        // Valorile booleane (true, false) sunt criptate in Java in cod binar (1, 0)
        /*
            nr1 > nr2 => rezultat > 0
            nr1 < nr2 => rezultat > 0
            nr1 == nr2 => rezultat
         */
        System.out.println(nr1.compareTo(nr2));

    }
}
