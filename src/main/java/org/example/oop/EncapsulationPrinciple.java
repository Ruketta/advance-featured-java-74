package org.example.oop;

/**
 *
 * ------------------------------ Incapsulare ------------------------------
 *
 * Incapsularea este un concept prin care ascundem atributele calsei prin modificatori de acces (private/protected)
 *  in scopul limitarii vizibilitatii publice si pentru a incuraja abstractizarea la nivel de metoda.
 *
 *  ------------------------------ Object Class ------------------------------
 *
 * Calsa de obiect este o clasa de tipul wrapper (POJO - plain old java object) care defineste trasaturile si comportamentul unui obiect in mod generalist.
 *
 */

class Employee{
    // atribute = trasaturile generale ale obiectelui de intanta al clasei
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String team;

    // constructor = modul de definire al schitei obiectului pe baza atributelor
        // constructorul neparametrizat = este mereu unul singur si are scopul de a defini o valoare incipienta a atributelor
        // de reula fiind inferioara a tipului de date al atributului (dar depinde de context)
    public Employee(){
        this.id = -1;
        this.lastName = "placeholder first name";
        this.firstName = "placeholder last name";
        this.age = -1;
        this.team = "placeholder team";
    }

        // constructorii parametrizati =  sunt in general o infinitate la numerul de atribute
    public Employee(long id, String firstName, String lastName, int employeeAge, String team){
        this.id = id;
        this.firstName = firstName ;
        this.lastName = lastName;
        age = employeeAge;
        this.team = team;
    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName ;
        this.lastName = lastName;
    }
    // functionalitatile = metode de utilizare prin intremediul instantei de obiect
    // getters/setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    // overridden methods

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                '}';
    }


    //custom methods

}

public class EncapsulationPrinciple {

    public static void main(String[] args) {
        Employee worker = new Employee();
        Employee worker2 = new Employee(1, "Iancu", "Jianu", 26, "Ravens");
        Employee worker3 = new Employee("Alex", "Alexandru");

        System.out.println("Original 1st worker :" + worker);
        System.out.println("Original 2nd worker :" + worker2);
        System.out.println("Original 3rd worker :" + worker3);
        System.out.println("--------------------");

        worker.setAge(78);
        worker3.setTeam("Falcons");
        System.out.println("modified 1st worker: " + worker);
        System.out.println("modified 3rd worker: " + worker);

    }
}
