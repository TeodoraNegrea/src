package ro.fasttrackit.temacurs9.ex2;

public class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee("");
        employee.getPosition("programmer");
        System.out.println(employee);
        Programmer programmer = new Programmer("");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("");
    }
}
