package ro.fasttrackit.temacurs9.ex2;

public class Employee implements Person {
    protected Person person;
    protected String position;

    public Employee() {
        this("");
    }

    public Employee(String position) {
        //this.person = person;
        this.position = position;
    }

    public void getPosition(String position) {
        person.getPosition("" + position);
        System.out.println("" + person.getFirstName());
        System.out.println("" + person.getLastName());
        System.out.println("" + person.getAddress());

    }

    public String getFirstName() {
        return "";
    }

    public String getLastName() {
        return "";

    }

    public String getAddress() {
        return "";
    }
}
