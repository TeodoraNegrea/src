package ro.fasttrackit.temacurs9;

public class MainPerson {
    public static void main(String[] args) {

        Person person = new Person("Andrei", "caprui");
        System.out.println(person.getName("Andrei"));
        System.out.println(person.getEyesColor("caprui"));
        person.getEyesColor("caprui");


    }
}
