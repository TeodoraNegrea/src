package ro.fasttrackit.temacurs9.ex2;

public class DatabaseAdmin extends Employee {
    protected String dbTehnology;

    public DatabaseAdmin(String dbTehnology) {
        super("");
        this.dbTehnology = dbTehnology;
    }

    @Override
    public String getAddress() {
        return "dbTehnology";
    }
}
